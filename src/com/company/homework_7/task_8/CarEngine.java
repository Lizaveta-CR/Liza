package com.company.homework_7.task_8;

public class CarEngine {

    private String number;

    public CarEngine(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "CarEngine{" +
                "number=" + number +
                '}';
    }
}
