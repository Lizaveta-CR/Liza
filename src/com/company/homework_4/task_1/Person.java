package com.company.homework_4.task_1;

import java.util.Objects;

public class Person {
    private String name;
    private int age;
    static private String text = "Hello from static";

    public Person() {
        this("Liza", 18);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void show() {
        System.out.println("Name: " + name + "\nAge: " + age);
        System.out.println();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person people = (Person) obj;
        return Objects.equals(name, people.name) && Objects.equals(age, people.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public void setText(String text) {
        Person.text = text;
    }

    public void printText() {
        System.out.println(text);
    }
}
