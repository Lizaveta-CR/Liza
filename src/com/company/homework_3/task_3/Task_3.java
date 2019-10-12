package com.company.homework_3.task_3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        int size;

        Scanner scanner = new Scanner(System.in);
        System.out.println("What size of array do want?");
        size = scanner.nextInt();

        int[] array=new int[size];

        for (int i = 0; i <array.length ; i++) {
            array[i]=i+1;
            if(array[i]%2==1){
                array[i]=0;
            }
        }
        System.out.println("Your array: ");
        System.out.println(Arrays.toString(array));
    }

}
