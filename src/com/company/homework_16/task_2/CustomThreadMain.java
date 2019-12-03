package com.company.homework_16.task_2;

// +
public class CustomThreadMain {
    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = new CustomThread();

        Thread thread = new Thread(runnable);

        thread.start();
        thread.join();
        System.out.println("Main finished");
    }
}
