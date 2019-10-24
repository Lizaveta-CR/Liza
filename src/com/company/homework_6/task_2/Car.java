package com.company.homework_6.task_2;

public class Car {
    private String number;
    private boolean start = false;
    private Engine engine;
    private Transmission transmission;

    public Car(String number) {
        this.number = number;
        this.engine = new Engine();
        this.transmission = new Transmission();
    }

    public void gas() {
        if (!start) {
            System.out.println("Let's go!");
        } else {
            System.out.println("Release the pedal!");
        }
    }

    public void move() {
        if (!start) {
            transmission.turnOnTheEngine();
            engine.increaseGear();
            gas();
        }
    }

    public void acceleration() {
        if (!start) {
            engine.increaseGear();
            gas();
        }
    }


    public void stop() {
        if (!start) {
            start = true;
            gas();
            engine.decreaseGear();
            transmission.shutOffTheEngine();
        }
    }

    public int getSpeed() {
        return engine.getCurrentGear() * 20;
    }

    @Override
    public String toString() {
        return "Car: " +
                "number= " + number;
    }
}
