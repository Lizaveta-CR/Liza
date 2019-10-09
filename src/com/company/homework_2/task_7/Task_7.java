package com.company.homework_2.task_7;

public class Task_7 {
    public static void main(String[] args) {
        int sum,iterationNumber;
        sum=0;
        iterationNumber=100;

        for (int i = 0; i <iterationNumber ; i++) {
            if(i%2==1) { sum+=i;}
        }
        System.out.println("The amount of odd numbers: "+sum);
    }
}
