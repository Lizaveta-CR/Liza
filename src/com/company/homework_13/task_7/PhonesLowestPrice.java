package com.company.homework_13.task_7;

import com.company.homework_13.task_3.Phone;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class PhonesLowestPrice {
    public static void main(String[] args) {
        List<Phone> phones = new ArrayList<>();
        phones.add(new Phone("Apple", 1000));
        phones.add(new Phone("Nokia", 800));
        phones.add(new Phone("Samsung", 900));
        phones.add(new Phone("HTC", 400));
        phones.add(new Phone("Xiaomi", 399));

        Optional<Phone> min = phones.stream().min(Comparator.comparing(Phone::getPrice));
        System.out.println("Model with the lowest price: " + min.orElse(new Phone("", 0)));
    }
}
