package com.company.homework_3.task_7;

import java.util.Arrays;

public class Task_7 {
    public static void main(String[] args) {
        int size = 10;
        boolean needIteration = true;
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.println("Original: ");
        System.out.println(Arrays.toString(array));

        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    int tmp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = tmp;
                    needIteration = true;
                }
            }
        }
        System.out.println("\nSort: ");
        System.out.println(Arrays.toString(array));
    }
}
