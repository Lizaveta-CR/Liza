package com.company.homework_17.task_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Stream;

public class AverageMain {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();

        int numOfElements = 125;

        for (int i = 0; i < numOfElements; i++) {
            integerList.add(i);
        }

        OptionalDouble stream = integerList.stream()
                .mapToInt(Integer::intValue).average();

        System.out.println("Average: " + stream.getAsDouble());
    }
}
