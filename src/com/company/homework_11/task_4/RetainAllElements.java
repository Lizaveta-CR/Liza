package com.company.homework_11.task_4;

import java.util.ArrayList;
import java.util.List;

public class RetainAllElements {
    public static void main(String[] args) {
        List<String> tomFavoriteColors = new ArrayList<>();
        tomFavoriteColors.add("Blue");
        tomFavoriteColors.add("Yellow");
        tomFavoriteColors.add("Black");
        tomFavoriteColors.add("Red");

        List<String> harryFavoriteColors = new ArrayList<>();
        harryFavoriteColors.add("Pink");
        harryFavoriteColors.add("Yellow");
        harryFavoriteColors.add("Red");
        harryFavoriteColors.add("Purple");

        tomFavoriteColors.retainAll(harryFavoriteColors);
        System.out.println("Both Tom's and Harry's favourite colors are: " + tomFavoriteColors);
    }
}
