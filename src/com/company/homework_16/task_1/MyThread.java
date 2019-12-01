package com.company.homework_16.task_1;

public class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        for (int i = 0; i <= 10; i++) {
            System.out.println("Number: " + i);
        }
        System.out.println(name + " finished");
    }
}
