package com.company.homework_11.task_5;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BenchmarkMiddle {
    private static final int COUNT = 100000;

    public static void main(String[] args) throws IOException {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        fillList(arrayList);//почему когда делаю System.out.println,то в первом случае выводится просто набор чисел(не массив)
        fillList(linkedList);
        testLists(arrayList);
        testLists(linkedList);
    }

    private static void fillList(List<Integer> list) {
        for (int i = 0; i < COUNT; i++) {
            list.add(i);
        }
    }

    private static void remove(List<Integer> list) {
        for (int i = 0; i < COUNT; i++) {
            if (i == list.size() / 2) {
                list.remove(i);
            }
        }
    }

    public static void testLists(List<Integer> list) throws IOException {
        long start = System.currentTimeMillis();
        remove(list);
        long finish = System.currentTimeMillis();
        System.out.println(list.getClass().getSimpleName() + "--" + (finish - start));
    }
}
