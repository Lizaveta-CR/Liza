package com.company.homework_11.task_8;

public class Shop {
    private String name;
    private int ID; // id

    public Shop(String name, int ID) {
        this.name = name;
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                '}';
    }
}
