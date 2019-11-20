package com.company.homework_13.task_9;

import com.company.homework_12.task_4.User;
import com.company.homework_13.task_3.Phone;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AppleGroupping {
    public static void main(String[] args) {
        List<Phone> phones = new ArrayList<>();
        phones.add(new Phone("Apple", 1000));
        phones.add(new Phone("Samsung", 900));
        phones.add(new Phone("Xiaomi", 500));
        phones.add(new Phone("Apple", 2300));
        phones.add(new Phone("Apple", 700));
        phones.add(new Phone("HTC", 400));
        phones.add(new Phone("Nokia", 870));
        phones.add(new Phone("Samsung", 1200));
        phones.add(new Phone("Xiaomi", 399));

        List<Phone> appleGrouping = phones.stream()
                .filter(phone -> phone.getModel().contains("Apple"))
                .collect(Collectors.toList());

        List<Phone> anotherGrouping = phones.stream()
                .filter(phone -> !phone.getModel().contains("Apple"))
                .collect(Collectors.toList());

        List<Phone> concat = Stream.concat(appleGrouping.stream(), anotherGrouping.stream()).collect(Collectors.toList());
        System.out.println(concat);
    }
}
