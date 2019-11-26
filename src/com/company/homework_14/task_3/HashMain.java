package com.company.homework_14.task_3;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
Есть две HashMap<String, List<Integer>>, нужно сделать из них одну (смержить)
 */
public class HashMain {
    public static void main(String[] args) {

        HashMap<String, List<Integer>> firstHashMap = new HashMap<>();
        firstHashMap.put("firstArray", new ArrayList<>(Arrays.asList(1, 3, 5, 7)));

        HashMap<String, List<Integer>> secondHashMap = new HashMap<>();

        secondHashMap.put("firstArray", new ArrayList<>(Arrays.asList(2, 4, 6, 8)));

        secondHashMap.forEach((key, value) -> firstHashMap.merge(key, value, (list1, list2) -> {
            list1.addAll(list2);
            return list1;
        }));
        System.out.println(firstHashMap);
    }
}
