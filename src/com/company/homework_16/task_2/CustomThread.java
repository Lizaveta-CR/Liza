package com.company.homework_16.task_2;

public class CustomThread implements Runnable {
    private static final int NUM_OF_ITERATIONS = 20; // лучше через конструктор

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        for (int i = 0; i <= NUM_OF_ITERATIONS; i++) {
            System.out.println(name + ": " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(name +" finished") ;
    }
}
