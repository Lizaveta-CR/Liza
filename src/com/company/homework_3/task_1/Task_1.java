package com.company.homework_3.task_1;

import java.util.Arrays;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        int[] array = new int[3];
        int sum = 0;
        int min,max = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Add numbers to array: ");

        for (int i = 0; i < array.length; i++) {
            int numbers = scanner.nextInt();
            array[i] = numbers;
        }
        System.out.println("Your array: ");
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Addition of all elements in array: ");
        System.out.println(sum);

        min = array[0];
        for (int i = 0; i < array.length; i++) {

            if (array[i] < min) {
                min = array[i];
            }
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println("Minimum : " + min + "\nMaximum: " + max);
    }
}
