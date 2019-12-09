package com.company.homework_14.task_4;

import java.util.Scanner;

// +
public class StringMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        StringUtils.showPalindrome(text);
    }
}
