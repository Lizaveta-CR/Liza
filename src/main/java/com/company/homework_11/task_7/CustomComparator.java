package com.company.homework_11.task_7;

import java.util.Comparator;

// Collections.reverseOrder() можно использовать для стандартных типов в java
public class CustomComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer intFirst, Integer intSecond) {
        return intFirst.compareTo(intSecond);
    }
}
