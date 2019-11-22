package com.company.homework_13.task_5;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Multiplication {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        int intAmount = 10;
        for (int i = 0; i < intAmount; i++) {
            integers.add(3 * i + 1);
        }
        System.out.println(integers);
        Optional<Integer> multInt = integers.stream()
                .limit(5)
                .reduce((x, y) -> x * y);

        // если коллекция будет пустой, то multInt будет Optional.empty() и будет исключение, добавь проверку multInt.ifPresent()
        System.out.println("Multiplication of first five elements is " + (multInt.get()));
    }
}
