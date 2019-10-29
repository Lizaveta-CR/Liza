package com.company.homework_7.task_6;

import java.util.Arrays;

// задание было отфильтровать, значит, на выходе должен быть массив соот-щий условию, а не просто вывести на экран
public class ShowWordsW {
    public static void main(String[] args) {
        String[] words = {"width", "ellipse", "Wrong", "hyperbola"};
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].startsWith("W") || words[i].startsWith("w")) {
                count++;
            }
        }
        String[] filteredArray = new String[count];
        count = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].startsWith("W") || words[i].startsWith("w")) {
                filteredArray[count++] = words[i];
            }
        }
        System.out.println(Arrays.toString(filteredArray));
    }
}
