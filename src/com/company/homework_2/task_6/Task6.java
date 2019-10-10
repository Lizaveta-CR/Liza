package com.company.homework_2.task_6;

public class Task6 {
    public static void main(String[] args) {
        int iterationNumber=100;
        int sum=0;// придумай другое название переменной
        // здесь имелось ввиду использование оператора '%' для выявления четного числа
        for (int i = 2; i <=iterationNumber ; i++) {
            if(i%2==0){sum+=i;};
        }
        System.out.println("Addition: "+sum);
    }
}

