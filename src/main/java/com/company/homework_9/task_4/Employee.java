package com.company.homework_9.task_4;

import java.io.Serializable;

// +
public class Employee implements Serializable {
    private static final long serialVersionUID = -4218739370408988514L;

    public String name;
    private int age;
    private Work work;

    public Employee(String name, int age, Work work) {
        this.name = name;
        this.age = age;
        this.work = work;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", work=" + work +
                '}';
    }
}
