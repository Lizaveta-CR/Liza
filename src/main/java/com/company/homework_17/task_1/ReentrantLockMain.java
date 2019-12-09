package com.company.homework_17.task_1;

import java.util.List;

// +
public class ReentrantLockMain {
    public static void main(String[] args) throws InterruptedException {
        AddThread addThread = new AddThread();

        int numOfElementsToAdd = 66;

        Runnable runnable = () -> {
            for (int i = 0; i < numOfElementsToAdd; i++) {
                addThread.addToList(String.valueOf(i));
            }
        };
        Thread threadFirst = new Thread(runnable);
        Thread threadSecond = new Thread(runnable);

        threadFirst.start();
        threadSecond.start();

        threadFirst.join();
        threadSecond.join();

        System.out.println(addThread.getList().size());
    }
}
