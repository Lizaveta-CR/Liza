package com.company.homework_13.task_8;

import com.company.homework_13.task_3.Phone;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

// +
public class PhoneSortCompany {
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

        Map<String, List<Phone>> modelGroupping = phones.stream()
                .collect(Collectors.groupingBy(Phone::getModel));
        System.out.println(modelGroupping);

        System.out.println("==another printing==");
        Set<Map.Entry<String, List<Phone>>> entries = modelGroupping.entrySet();
        for (Map.Entry<String, List<Phone>> entry : entries) {
            System.out.println(entry);
        }
    }
}
