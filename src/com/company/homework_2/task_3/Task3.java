package com.company.homework_2.task_3;

public class Task3 {
    public static void main(String[] args) {
    int sum=0;
     for (int i = 0; i < 256; i++){
         i=i*i;//it's geometric progression
         sum=sum+i;

     }
        System.out.println("Addition: "+sum);

    }
}