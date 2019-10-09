package com.company.homework_2;

public class Task_2 {
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
