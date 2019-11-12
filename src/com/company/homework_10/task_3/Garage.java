package com.company.homework_10.task_3;

import java.util.ArrayList;
import java.util.Arrays;

public class Garage<T> {
    private T[] car;

// пустая строка не нужна
    public Garage(T[] car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Garage{car=" + Arrays.toString(car) +
                '}';
    }
}
