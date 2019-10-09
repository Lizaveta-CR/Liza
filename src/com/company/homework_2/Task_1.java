package com.company.homework_2;

public class Task_1 {
    public static void main(String[] args) {
        double totalKm=10;
        int iterationNumber;
        iterationNumber=7;
        for (int i = 0; i <iterationNumber ; i++) {
            totalKm = totalKm+(totalKm*0.1);
        }
        System.out.println("Total amount: "+totalKm);
    }
}
