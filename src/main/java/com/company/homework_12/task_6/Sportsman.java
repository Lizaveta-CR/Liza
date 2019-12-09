package com.company.homework_12.task_6;

import java.awt.*;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;

// +
public class Sportsman implements Comparable<Sportsman> {
    private String name;
    private int speed;
    private MedalStrategy medal;

    public Sportsman(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public Sportsman(String name, int speed, MedalStrategy medal) {
        this.name = name;
        this.speed = speed;
        this.medal = medal;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public MedalStrategy getMedal() {
        return medal;
    }

    public void setMedal(MedalStrategy medal) {
        this.medal = medal;
    }

    @Override
    public String toString() {
        return "Sportsman{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", medal=" + medal +
                '}';
    }

    @Override
    public int compareTo(Sportsman sportsman) {
        return -this.speed + sportsman.getSpeed();
    }
}
