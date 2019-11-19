package com.company.homework_12.task_1;

// +
public class Box implements Comparable<Box> {
    private String name;

    public Box(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Box{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Box box) {
        return name.compareTo(box.getName());
    }
}
