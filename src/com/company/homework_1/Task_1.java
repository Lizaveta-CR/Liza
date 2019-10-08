package com.company.homework_1;

public class Task_1 {
    public static void main(String[] args) {
        double totalKm=10;
        for (int i = 0; i <7 ; i++) {
            totalKm = totalKm+(totalKm*0.1);
        }
        System.out.println("Total sum: "+totalKm);
    }
}
