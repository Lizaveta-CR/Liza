package com.company.homework_13.task_2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SortMaxLength {
    public static void main(String[] args) {
        StringComparator stringComparator = new StringComparator();
        List<String> stringList = new ArrayList<>();
        stringList.add("Nothing");
        stringList.add("is");
        stringList.add("important");
        stringList.add("except Java");

        System.out.println("===First method===");
        Optional<String> max = stringList.stream().max(stringComparator);
        System.out.println(max.get());

        System.out.println("===Second method===");
        Optional<String> collect = stringList.stream()
                .max(Comparator.comparingInt(String::length));
        System.out.println(collect.get());
    }
}
