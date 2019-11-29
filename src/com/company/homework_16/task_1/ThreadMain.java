package com.company.homework_16.task_1;

public class ThreadMain {
    public static void main(String[] args) {
        MyThread myThread = new MyThread("MyThread");
        myThread.start();

        System.out.println("Finished");
    }
}
