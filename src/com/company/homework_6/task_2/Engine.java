package com.company.homework_6.task_2;

// у тебя в классе Engine лежит функционал класса Transmission
public class Engine {
    private int currentGear;

    public void increaseGear() {
        // 7 -> private static final int MAX_GEAR = 7;
        if (currentGear >= 0 && currentGear <= 7) {
            currentGear++;
        } else {
            System.out.println("Sorry, but i cant't do more");
        }
        System.out.println("Gear increased: " + currentGear);
// пустая строка не нужна
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
