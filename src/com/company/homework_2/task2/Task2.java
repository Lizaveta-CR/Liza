package com.company.homework_2.task2;

public class Task2 {
    public static void main(String[] args) {
        int a=1;
        int iterationNumber=24;
        iterationNumber/=3;
        for (int i = 0; i < iterationNumber; i++) {
           a*=2;
        }
        System.out.println("Total amount: "+a);
    }
}
