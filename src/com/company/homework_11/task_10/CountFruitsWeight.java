package com.company.homework_11.task_10;

import java.util.*;

public class CountFruitsWeight {
    public static void main(String[] args) {
        Fruits apple_11 = new Fruits("apple", 11);
        Fruits apple_13 = new Fruits("apple", 13);
        Fruits pineapple_12 = new Fruits("pineapple", 12);
        Fruits pineapple_14 = new Fruits("pineapple", 14);

        List<Fruits> fruitsList = new ArrayList<>();
        fruitsList.add(apple_11);
        fruitsList.add(apple_13);
        fruitsList.add(pineapple_12);
        fruitsList.add(pineapple_14);

        FruitsWarehouse fruitsWarehouse = new FruitsWarehouse(fruitsList);
        System.out.println("===fruits warehouse");
        System.out.println(fruitsWarehouse);

        Map<Integer, Fruits> fruitsMap = new HashMap<>();
        for (Fruits fruits : fruitsList) {
            /*
           key =  fruit.getName;
            Integer currWeight =  fruit.getWeight();
           if(fruitMap.contains(key) {
         Integer weight =  fruitsMap.get(key);
        fruitsMap.put(key, weight+currWeight);
           } else {
           fruitsMap.put(key, fruitWeight);
           }
           */
            int weight = fruits.getWeight();
            fruitsMap.put(weight, fruits);
        }
        System.out.println("===fruits map");
        System.out.println(fruitsMap);


        //дальше я не не разобралась,как по HashMap взять имя "значения",которое представляет объект,чтобы сравнивать
        // и складывать вес

//        Fruits newValue = fruitsMap.get(apple_11);
//        System.out.println("After = " + newValue);
//    }

//    public static void printMap(Map map) {
//        Iterator iterator = map.entrySet().iterator();
//        while (iterator.hasNext()) {
//            Map.Entry pair = (Map.Entry) iterator.next();
//            System.out.println(pair.getKey() + " = " + pair.getClass());
//            iterator.remove(); // avoids a ConcurrentModificationException
//        }
//    }
    }
}

