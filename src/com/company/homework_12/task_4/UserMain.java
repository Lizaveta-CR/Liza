package com.company.homework_12.task_4;

import java.util.Scanner;

// +
public class UserMain {
    public static void main(String[] args) {
        UserCreator creator = () -> {
            System.out.println("Enter name: ");
            Scanner in = new Scanner(System.in);
            String userName = in.nextLine();
            return new User(userName);
        };
        User user = creator.createUser();
        System.out.println(user);
    }
}
