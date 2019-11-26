package com.company.homework_14.task_4;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

// +
public class StringUtils {
    public static void showPalindrome(String text) {
        String cleanText = text.replaceAll("\\p{P}", "").toLowerCase();
        String[] textSplit = cleanText.split(" ");
        String palindrome = "";
        for (String s : textSplit) {
            if (isPalindrome(s)) {
                palindrome = palindrome.concat(s).concat(" ");
            }
        }
        System.out.println(palindrome);
    }

    private static boolean isPalindrome(String word) {
        int length = word.length();
        for (int i = 0; i < (length / 2); i++) {
            if (word.charAt(i) != word.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
}

