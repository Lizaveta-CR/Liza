package com.company.homework_11.task_2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListMain {
    private final static Integer SIZE = 100;

    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>(SIZE);
        addElements(ints);
        System.out.println(ints);
        deleteEvenElements(ints);
        System.out.println("After deleting: " + ints);
    }

    private static void addElements(List<Integer> integerList) {
        int[] numbers = new int[SIZE];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }
        for (int number : numbers) {
            integerList.add(0, number);
        }
    }

    private static void deleteEvenElements(List<Integer> integerList) {
        Iterator<Integer> iterator = integerList.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            if (next % 2 == 0) {
                iterator.remove();
            }
        }
    }
}
