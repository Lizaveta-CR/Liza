package com.company.homework_5.task_3;

import java.util.Arrays;

public class HouseCatalog {
    private House[] houses;

    public HouseCatalog(House[] houses) {
        this.houses = houses;
    }

    @Override
    public String toString() {
        return "HouseCatalog: " +
                "houses" + Arrays.toString(houses) +
                '}';
    }
}

