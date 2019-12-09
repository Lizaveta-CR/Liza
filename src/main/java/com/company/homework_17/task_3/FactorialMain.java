package com.company.homework_17.task_3;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.concurrent.*;

public class FactorialMain {
    public static void main(String[] args) throws InterruptedException {
//после 12 считает неправильно(независимо от "devidedNum").Как исправить ситуацию?
        // посчитай факториал 13 в калькуляторе и ты увидишь что число очень большое и оно выходит за диапазон инта,
        // поменяй на Long и твоя программа будет работать корректно
        int num = 20;

        int devidedNum = num / 2;

        Callable<Long> factorialFirst = new Factorial(1, devidedNum);
        Callable<Long> factorialSecond = new Factorial(devidedNum + 1, num);

        List<Callable<Long>> factorials = List.of(factorialFirst, factorialSecond);

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        List<Future<Long>> futures = new ArrayList<>(2);
        factorials.forEach(factorial -> {
            Future<Long> submit = executorService.submit(factorial);
            futures.add(submit);
        });

        OptionalLong factorial = futures.stream()
                .mapToLong(future -> {
                    try {
                        return future.get();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (ExecutionException e) {
                        throw new RuntimeException();
                    }// если вернешь 1, то можешь полусить некорректный результат работы программы, а это гораздо хуже
                    return 1;
                })
                .reduce((x, y) -> x * y);

        System.out.println(factorial.getAsLong());

        executorService.shutdown();

    }
}
