package com.company.homework_6.task_2;

// у тебя в классе Transmission лежит функционал класса Engine
public class Transmission {
    private boolean start = false;

    // я думаю этот метод еще должен менять значение поля 'start'
    public void shutOffTheEngine() {
        if (!start) {
            System.out.println("The engine is off");
        } else {
            System.out.println("The engine is already off");
        }
// пустая строка не нужна
    }

    // я думаю этот метод еще должен менять значение поля 'start'
    public void turnOnTheEngine() {
        if (!start) {
            System.out.println("The engine is on");
        } else {
            System.out.println("The engine is already on");
        }
// пустая строка не нужна
    }
}
