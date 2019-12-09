package com.company.homework_3.task_4;

import java.util.Arrays;
import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What dimension do you want?");
        int size = scanner.nextInt();

        /*
        если я ввожу число 1, то ничего не выводится, а при 9 таблица умножение до 8 
        Я думаю это не совсем корректно с точки зрения user friendly
        а так красивая таблица получилась, технически нету претензий
        */
        int[][] twoDimArray = new int[size][size];
        for (int i = 1; i < twoDimArray.length; i++) {
            for (int j = 1; j < twoDimArray[i].length; j++) {
                twoDimArray[i][j] = (i) * (j);
                System.out.format("%5d", twoDimArray[i][j]);
            }
            System.out.println();
        }
    }
}
