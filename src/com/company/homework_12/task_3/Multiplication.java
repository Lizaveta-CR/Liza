package com.company.homework_12.task_3;

import java.util.Scanner;
import java.util.function.BinaryOperator;

public class Multiplication {
    public static void main(String[] args) {
        BinaryOperator<Integer> multiply = (x, y) -> x * y;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers to multiply");
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        System.out.println(multiply.apply(firstNumber, secondNumber));
    }
}
