package com.company.homework_5.task_2;

// +
public class Box {
    private int numOfFeltTips;
    private double weight;
    private String name;

    public Box(int numOfFeltTips, double weight, String name) {
        this.numOfFeltTips = numOfFeltTips;
        this.weight = weight;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Box{" +
                "Felt-tips=" + numOfFeltTips +
                ", Box weight=" + weight +
                ", Number='" + name + '\'' +
                '}';
    }
}
