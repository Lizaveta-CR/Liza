package com.company.homework_9.task_4;

import java.io.Serializable;

// +
public class Work implements Serializable {
    private String name;
    private int minExperience;

    public Work(String name, int minExperience) {
        this.name = name;
        this.minExperience = minExperience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMinExperience() {
        return minExperience;
    }

    public void setMinExperience(int minExperience) {
        this.minExperience = minExperience;
    }

    @Override
    public String toString() {
        return "Work{" +
                "name='" + name + '\'' +
                ", minExperience=" + minExperience +
                '}';
    }
}
