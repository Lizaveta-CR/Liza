package com.company.homework_2.task_2;

public class Task2 {
    public static void main(String[] args) {
        // a -> amoeba - гугл транслейт тебе в помощь
        int a=1;
        int iterationNumber=24;
        iterationNumber/=3;
        // я думаю здесь имеет смысл не i++, а i = i+3, т.е. каждые 3 часа
        for (int i = 0; i < iterationNumber; i++) {
           a*=2;
        }
        System.out.println("Total amount: "+a);
    }
}
