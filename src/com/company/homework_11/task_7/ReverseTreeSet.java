package com.company.homework_11.task_7;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class ReverseTreeSet {
    public static void main(String[] args) {
        Comparator<Integer> customComparator = new CustomComparator();
        customComparator = customComparator.reversed();
        Set<Integer> integers = new TreeSet<>(customComparator);
        int numOfIteration = 100;
        for (int i = 0; i < numOfIteration; i++) {
            integers.add(i = i + i ^ 2);
        }
        System.out.println(integers);
    }
}
