package com.company.homework_2.task_8;

public class Task8 {
    public static void main(String[] args) {
       int sumOdd=0;
       int sumEven=0;
       int sum=0;
       int iterationNumber=100;
        for (int i = 0; i < iterationNumber; i++) {
           if(i%2==0){
               sumEven+=i;
           } else{
               sumOdd+=i;
           }
        }
        sum=sumEven+sumOdd;// можно посчитать 1 раз после цикла сложив четные и нечетные
        System.out.println("The amount of even numbers: "+sumEven);
        System.out.println("The amount of odd numbers: "+sumOdd);
        System.out.println("Total amount of all numbers: "+sum);

    }
}
