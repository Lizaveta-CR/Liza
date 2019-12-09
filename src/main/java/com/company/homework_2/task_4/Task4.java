package com.company.homework_2.task_4;

public class Task4 {
    public static void main(String[] args) {
        String firstArgument = args[0];//a

        // a, b - так себе названия для переменных, придумай другие
        int firstArg = Integer.valueOf(firstArgument);//to make my own values
        int secondArg = Integer.valueOf(args[1]);
        int res=0;// придумай хорошее ("говорящее") название переменной и комментарий не понадобится

        System.out.println("a = " + firstArg);
        System.out.println("b = " + secondArg);
        for (int i = 0; i < firstArg; i++) {
            res=res+secondArg;
        }
        System.out.println("Multiplication: "+res);
    }
}
