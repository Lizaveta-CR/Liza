package com.company.homework_11.task_3;

import java.util.ArrayList;
import java.util.List;

// +
public class RemoveAllElements {
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

        tomFavoriteColors.removeAll(harryFavoriteColors);
        System.out.println("Tom likes "+tomFavoriteColors+" ,but Harry doesn't like this colors");
    }
}
