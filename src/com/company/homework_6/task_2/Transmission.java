package com.company.homework_6.task_2;

public class Transmission {
    private boolean start = false;

    public void shutOffTheEngine() {
        if (!start) {
            System.out.println("The engine is off");
        } else {
            System.out.println("The engine is already off");
        }

    }

    public void turnOnTheEngine() {
        if (!start) {
            System.out.println("The engine is on");
        } else {
            System.out.println("The engine is already on");
        }

    }
}
