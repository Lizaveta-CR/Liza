package com.company.homework_1;

public class Task_3 {
    public static void main(String[] args) {
    int sum=1;
    int q=2;
     for (int i = 0; i < 256; i++){
         q=q*q;
         sum=sum+q;
     }
        System.out.println("Addition: "+sum);

    }
}
