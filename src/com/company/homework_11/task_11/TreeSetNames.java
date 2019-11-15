package com.company.homework_11.task_11;

import java.util.TreeSet;

public class TreeSetNames {
    public static void main(String[] args) {
        TreeSet<String> names = new TreeSet<>();
        names.add("Helly");
        names.add("Kelly");
        names.add("Olya");
        names.add("Ann");
        names.add("Misha");
        names.add("Welly");

        System.out.println(names);
        System.out.println(names.subSet("H", "W"));

        //почему не работает этот метод?
        String[] strings = {"h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w"};
        for (String name : names) {
            name = name.substring(0, 1).toLowerCase();
            for (int i = 0; i < strings.length; i++) {
                if (name.matches(strings[i])) {
                    System.out.println(name); //почему ничего не выводит,а только блок else?
                } else {
                    System.out.println("No such name");
                }
            }
        }

    }
}
