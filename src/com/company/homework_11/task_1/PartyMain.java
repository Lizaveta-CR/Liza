package com.company.homework_11.task_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PartyMain {
    public static void main(String[] args) {
        List<String> partyVisitors = new ArrayList<>();
        partyVisitors.add("Victor");
        partyVisitors.add("Mary");
        partyVisitors.add("Misha");
        partyVisitors.add("Liza");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name: ");
        boolean needName = true;
        while (needName) {
            String name = scanner.nextLine();
            if (partyVisitors.contains(name)) {
                System.out.println("Yes,you're invited!");
                needName = false;
            } else {
                System.out.println("Sorry,no such person in list");
            }
        }
    }
}
