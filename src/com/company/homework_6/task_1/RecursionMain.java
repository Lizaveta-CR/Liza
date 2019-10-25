package com.company.homework_6.task_1;

import java.util.Scanner;

public class RecursionMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What size of array do want?");
        int size = scanner.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 11);
        }
        printArray(array, 0);
    }

    private static void printArray(int[] array, int index) {
        if (index < array.length) {
            // +array - '+' в начале не нужен
            System.out.print(+array[index] + " ");
            index++;
            printArray(array, index);
        }
        return;
    }
}
