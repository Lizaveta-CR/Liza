package com.company.homework_14.task_5;

import java.io.Serializable;

public class Cat implements Serializable {
    private String breed;
    private int age;

    public Cat() {
        this.breed = "Empty";
        this.age = 0;
    }

    public Cat(String breed, int age) {
        this.breed = breed;
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "breed='" + breed + '\'' +
                ", age=" + age +
                '}';
    }
}
