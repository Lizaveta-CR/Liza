package com.company.homework_2.task_9;

//+
public class Task9 {
    public static void main(String[] args) {
        int rows=4;
        System.out.println("Original first: ");
        for (int i = 0; i <=rows; i++) {
           for (int j = 0; j < rows-i; j++) {
                //this cycle shows how many stars we want on each step
                System.out.print("  ");//to make inverse we put spaces
            }
             for (int j = i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("\nFirst half: ");
        for (int i = 0; i <rows; i++) {
            for (int j = i+1; j >0 ; j--) {
                System.out.print(" *");
            }
            System.out.println();
        }

        System.out.println("\nOriginal second: ");
        for (int i = rows; i > 0; i--) {
            for (int j = 0; j <rows-i ; j++) {
                System.out.print("  ");
            }
            for (int j = i; j >0 ; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("\nSecond half: ");
        for(int i = rows; i >0; i--){
            for (int j = i; j >0 ; j--) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}

