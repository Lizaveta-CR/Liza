package com.company.homework_2.task_5;

public class Task5 {
    public static void main(String[] args) {
        double sm,dm;
        int counter=0;

        for (dm =1; dm <21; dm++) {
            sm=dm*2.54;
            System.out.println(dm+" inch corresponds "+sm+" centimeters");
            counter++;
        }

    }
}
