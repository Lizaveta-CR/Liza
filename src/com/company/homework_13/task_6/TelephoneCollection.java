package com.company.homework_13.task_6;

import com.company.homework_13.task_3.Phone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TelephoneCollection {
    public static void main(String[] args) {
        List<Phone> phones = new ArrayList<>();
        phones.add(new Phone("Apple"));
        phones.add(new Phone("Nokia"));
        phones.add(new Phone("Nokia"));
        phones.add(new Phone("Samsung"));
        phones.add(new Phone("HTC"));
        phones.add(new Phone("Xiaomi"));
        phones.add(new Phone("HTC"));
        phones.add(new Phone("Apple"));

        System.out.println(phones);
        
        phones.stream().distinct().forEach(System.out::println);
    }
}
