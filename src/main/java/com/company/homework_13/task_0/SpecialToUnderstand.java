//package com.company.homework_13.task_0;
//
//import java.util.*;
//
//public class SpecialToUnderstand {
//    public static void main(String[] args) {
//
//        //да-да,я поняла,что это действительно удобно,нежели писать через Map,не используя stream...
//
//        List<Phone> phones = new ArrayList<>();
//        phones.add(new Phone("Xs", "Apple", 200));
//        phones.add(new Phone("8", "Apple", 400));
//        phones.add(new Phone("S10", "Samsung", 350));
//        phones.add(new Phone("S10", "Samsung", 350));
//        phones.add(new Phone("3310", "Nokia", 1000));
//
////тут все печально,придумать я так и не смогла..
//        Map<Boolean, List<Phone>> phoneMap = new HashMap<>();
//        for (Phone phone : phones) {
//            if (phoneMap.containsKey(phone.getProducer().equals("Apple"))) {
//                phoneMap.put(true, /*phones, тут я просто не знаю,что и вставить,чтобы выдавало именно объект*/);
//            } else {
//                phoneMap.put(false, //phones);
//            }
//        }
//        System.out.println(phoneMap);
//    }
//}
