package com.company.homework_3.task_8;

import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter height: ");
        int height = scanner.nextInt();

        for (int i = 1; i < height / 2 + 1; i++) {
            for (int j = 1; j < i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        for (int i = height / 2 + 1; i > 0; i--) {
            for (int j = 1; j < i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }//для симметричности я никак не могу придумать
}