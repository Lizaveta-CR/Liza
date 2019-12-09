package com.company.homework_13.task_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FindNumber {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        int intAmount = 10;
        for (int i = 0; i < intAmount; i++) {
            integers.add((int) (Math.pow(i, 2) + 1));
        }
        System.out.println(integers);

        Optional<Integer> intStream = integers.stream()
                .filter(integer -> integer > 22)
                .findFirst();
        // а если в коллекции не будет числа > 22? будет исключение, когда ты вызовешь метод get(), добавь проверку
        System.out.println(intStream.get());
    }
}
