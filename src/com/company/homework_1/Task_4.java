package com.company.homework_1;

public class Task_4 {
    public static void main(String[] args) {
        String firstArgument = args[0];

        int a = Integer.valueOf(firstArgument);
        int b = Integer.valueOf(args[1]);
        int c=0;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        for (int i = 0; i < b; i++) {
            c=c+a;
        }
        System.out.println("Multiplication: "+c);
    }
}
