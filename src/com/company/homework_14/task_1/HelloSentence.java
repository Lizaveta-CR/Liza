package com.company.homework_14.task_1;

import java.util.Scanner;

/*
Есть приветственное предложение:
"Hello, my name is Alex. I'm java developer and I'm glad to become a part of your company."
Необходимо сделать так, чтобы можно было подставить любое имя и язык программирования.
Напишите программу, которая бы позволяла вводить имя и язык программирования с консоли и затем выводила на экран
полученное предложение
 */
public class HelloSentence {
    public static void main(String[] args) {
        // используй шаблон String.format() %s, %d
        String string = "Hello, my name is Alex. I'm java developer and I'm glad to become a part of your company.";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Enter programing language: ");
        String language = scanner.nextLine();

        String alexReplace = string.replace("Alex", name);
        String replace = alexReplace.replace("java", language);

        System.out.println(replace);
    }
}
