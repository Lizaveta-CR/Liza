package com.company.homework_8.task_2;

import java.util.Scanner;

public class StringToNumber {
    public static void main(String[] args) {
        String string = null;
        try {
            System.out.println("Please,enter numbers: "); // 'numbers:' вроде только 1
            Scanner scanner = new Scanner(System.in);
            string = scanner.next();
            // Number -> number
            int Number = Integer.parseInt(string);
            System.out.println("Your number: " + Number);
        } catch (NumberFormatException e) {
            System.err.println("Wrong number format: " + string);
        }
    }
}
