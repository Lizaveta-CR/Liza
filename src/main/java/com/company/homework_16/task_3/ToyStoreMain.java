package com.company.homework_16.task_3;

// +
public class ToyStoreMain {
    public static void main(String[] args) throws InterruptedException {
        ToysStore toysStore = new ToysStore();

        int iterFirst = 100;
        int iterSecond = 50;

        Runnable first = () -> {
            for (int i = 0; i < iterFirst; i++) {
                toysStore.putToy();
            }
        };
        Runnable second = () -> {
            for (int i = 0; i < iterSecond; i++) {
                toysStore.putToy();
            }
        };
        Thread threadFirst = new Thread(first);
        Thread threadSecond = new Thread(second);

        threadFirst.start();
        threadSecond.start();

        threadFirst.join();
        threadSecond.join();

        System.out.println("Number of toys in the shop: " + toysStore.getNumOfToys());
    }
}
