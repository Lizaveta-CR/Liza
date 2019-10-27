package com.company.homework_7.task_6;

public class ShowWordsW {
    public static void main(String[] args) {
        String[] words = {"width", "ellipse", "Wrong", "hyperbola"};
        for (int i = 0; i < words.length; i++) {
            if (words[i].startsWith("W") || words[i].startsWith("w")) {
                System.out.println(words[i]);
            }
        }
    }
}
