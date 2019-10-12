package com.company.homework_3.task_2;

import java.util.Arrays;
import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        double average = 0;
        int size;

        Scanner scanner = new Scanner(System.in);
        System.out.println("What size of array do want?");
        size = scanner.nextInt();

        if(size<0){
            size=Math.abs(size);
        }

        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 11);
        }
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            average += array[i];
        }
        average = average / array.length;
        System.out.println("Average: " + average);
    }
}
