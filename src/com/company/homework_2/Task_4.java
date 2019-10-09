package com.company.homework_2;

public class Task_4 {
    public static void main(String[] args) {
        String firstArgument = args[0];//a

        int a = Integer.valueOf(firstArgument);//to make my own values
        int b = Integer.valueOf(args[1]);
        int c=0;//counter of multiplication

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        for (int i = 0; i < a; i++) {
            c=c+b;
        }
        System.out.println("Multiplication: "+c);
    }
}
