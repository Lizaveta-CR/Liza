package com.company.homework_6.task_2;

public class Engine {
    private int currentGear;

    public void increaseGear() {
        if (currentGear >= 0 && currentGear <= 7) {
            currentGear++;
        } else {
            System.out.println("Sorry, but i cant't do more");
        }
        System.out.println("Gear increased: " + currentGear);

    }

    public void decreaseGear() {
        if (currentGear > 0 && currentGear <= 7) {
            currentGear--;
        } else {
            System.out.println("Sorry, it's my minimum");
        }
        System.out.println("Gear decreased: " + currentGear);
    }

    public int getCurrentGear() {
        return currentGear;
    }
}
