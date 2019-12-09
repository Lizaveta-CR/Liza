package com.company.homework_12.task_7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LambdaComparatorMain {
    public static void main(String[] args) {
        Comparator<String> stringComparator = (String first, String second) -> -first.compareTo(second); // -first.compareTo(second) -> -1 * first.compareTo(second) так виднее
        List<String> stringList = new ArrayList<>();
        stringList.add("Winter");
        stringList.add("is");
        stringList.add("coming");

        System.out.println("Before: " + stringList);
        stringList.sort(stringComparator);
        System.out.println("After: " + stringList);
    }
}
