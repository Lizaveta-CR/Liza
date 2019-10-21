package com.company.homework_5.task_1;

public class ComputerMain {
    public static void main(String[] args) {
        MacBook macbook = new MacBook();

        macbook.turnOff();
        macbook.turnOn();
        macbook.reset();

        Computer newMacbook = new MacBook();
        newMacbook.turnOn();
        newMacbook.turnOff();
        newMacbook.reset();

    }
}
