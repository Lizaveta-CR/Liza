package com.company.homework_11.task_8;

import java.util.HashSet;
import java.util.Set;

// +
public class HashSetShops {
    public static void main(String[] args) {
        Set<Shop> shops = new HashSet<>();

        shops.add(new Shop("Nike", 1325));//они все добавились,тк не переопределен hashCode(),equals()
        shops.add(new Shop("Nike", 1325));

        System.out.println(shops);
    }
}

