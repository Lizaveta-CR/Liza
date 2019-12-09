package com.company.homework_7.task_9;

// +
public class Task_9 {
    public static void main(String[] args) {
        String[] strings = {"Hello world", "Hello", "All", "Math", "Ellipse"};
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].length() > 5) {
                System.out.println(strings[i]);
            }
        }
    }
}
