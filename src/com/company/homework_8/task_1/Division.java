package com.company.homework_8.task_1;

import java.util.Scanner;

// +
public class Division {
    public static void main(String[] args) {
        try {
            System.out.println("Please,enter 2 numbers: ");
            Scanner scanner = new Scanner(System.in);
            int firstNum = scanner.nextInt();
            int secondNum = scanner.nextInt();
            int result = divide(firstNum, secondNum);
            System.out.println("The result of division is: " + result);
        } catch (ArithmeticException a) {
            System.err.println("You can't divide by 0!");
        }
    }

    public static int divide(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }
}
