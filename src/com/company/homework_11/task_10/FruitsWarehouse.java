package com.company.homework_11.task_10;

import java.util.List;

public class FruitsWarehouse {
    private List<Fruits> fruits;

    public FruitsWarehouse(List<Fruits> fruits) {
        this.fruits = fruits;
    }

    public List<Fruits> getFruits() {
        return fruits;
    }

    public void setFruits(List<Fruits> fruits) {
        this.fruits = fruits;
    }

    @Override
    public String toString() {
        return "FruitsWarehouse{" +
                "fruits=" + fruits +
                '}';
    }
}
