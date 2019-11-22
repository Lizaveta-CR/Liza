package com.company.homework_13.task_10;

import com.company.homework_13.task_3.Phone;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// +
public class PhoneMap {
    public static void main(String[] args) {
        List<Phone> phones = new ArrayList<>();
        phones.add(new Phone("Apple", 1000));
        phones.add(new Phone("Nokia", 800));
        phones.add(new Phone("Samsung", 900));
        phones.add(new Phone("Xiaomi", 500));
        phones.add(new Phone("Apple", 2300));
        phones.add(new Phone("HTC", 400));
        phones.add(new Phone("Nokia", 870));
        phones.add(new Phone("Samsung", 1200));
        phones.add(new Phone("Xiaomi", 399));

        Map<String, Long> grouping = phones.stream()
                .collect(Collectors.groupingBy(Phone::getModel, Collectors.counting()));

        for (Map.Entry<String, Long> entry : grouping.entrySet()) {
            System.out.println(entry);
        }
    }
}
