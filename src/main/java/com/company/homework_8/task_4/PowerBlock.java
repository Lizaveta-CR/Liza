package com.company.homework_8.task_4;

public class PowerBlock {
    private int power;

    public PowerBlock(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    @Override
    public String toString() {
        return "PowerBlock{" +
                "power=" + power +
                '}';
    }
}
