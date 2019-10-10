package com.company.homework_2.task_1;

public class Task1 {
    public static void main(String[] args) {
        double totalKm=10;
        //  int iterationNumber = 7; лучше так
        int iterationNumber;
        iterationNumber=7;
        for (int i = 0; i <iterationNumber ; i++) {
            totalKm = totalKm+(totalKm*0.1);
        }
        System.out.println("Total amount: "+totalKm);
    }
}
