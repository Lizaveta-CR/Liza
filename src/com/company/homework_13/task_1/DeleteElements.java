package com.company.homework_13.task_1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// +
public class DeleteElements {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Nothing");
        stringList.add("is");
        stringList.add("important");
        stringList.add("except Java");

        List<String> streamStrings = stringList.stream()
                .filter(strings -> strings.length() > 5)
                .collect(Collectors.toList());
        System.out.println(streamStrings);
    }
}
