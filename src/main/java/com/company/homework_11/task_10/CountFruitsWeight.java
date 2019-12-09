package com.company.homework_11.task_10;

import java.util.*;

public class CountFruitsWeight {
    public static void main(String[] args) {
        Fruits apple_11 = new Fruits("apple", 11);
        Fruits apple_13 = new Fruits("apple", 13);
        Fruits pineapple_12 = new Fruits("pineapple", 12);
        Fruits pineapple_14 = new Fruits("pineapple", 14);

        List<Fruits> fruitsList = new ArrayList<>();
        fruitsList.add(apple_11);
        fruitsList.add(apple_13);
        fruitsList.add(pineapple_12);
        fruitsList.add(pineapple_14);

        System.out.println("===fruits list");
        System.out.println(fruitsList);

        Map<String, Integer> fruitsMap = new HashMap<>();
        for (Fruits fruits : fruitsList) {
            if (fruitsMap.containsKey(fruits.getName())) {
                // лучше не писать код в такую длинную строку. сложение лучше вынести в отдельную переменную
                fruitsMap.put(fruits.getName(), fruitsMap.get(fruits.getName()) + fruits.getWeight());
            } else {
                fruitsMap.put(fruits.getName(), fruits.getWeight());
            }
        }
        System.out.println("===fruits map");
        System.out.println(fruitsMap);
    }
}

