package com.company.homework_17.task_3;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.concurrent.*;

public class FactorialMain {
    public static void main(String[] args) throws InterruptedException {
//после 12 считает неправильно(независимо от "devidedNum").Как исправить ситуацию?
        // посчитай факториал 13 в калькуляторе и ты увидишь что число очень большое и оно выходит за диапазон инта,
        // поменяй на Long и твоя программа будет работать корректно
        int num = 13;

        int devidedNum = num / 2;

        Callable<Integer> factorialFirst = new Factorial(1, devidedNum);
        Callable<Integer> factorialSecond = new Factorial(devidedNum + 1, num);

        List<Callable<Integer>> factorials = List.of(factorialFirst, factorialSecond);

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        List<Future<Integer>> futures = new ArrayList<>(2);
        factorials.forEach(factorial -> {
            Future<Integer> submit = executorService.submit(factorial);
            futures.add(submit);
        });

        OptionalInt factorial = futures.stream()
                .mapToInt(future -> {
                    try {
                        return future.get();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (ExecutionException e) {
                        throw new RuntimeException();
                    }
                    return 1;
                })
                .reduce((x, y) -> x * y);

        System.out.println(factorial.getAsInt());

        executorService.shutdown();

    }
}
