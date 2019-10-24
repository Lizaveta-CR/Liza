package com.company.homework_6.task_3;

import java.util.Scanner;

public class MainTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello,user!\nPress 1 of 3 numbers: \n1-count coconuts, 2-count bananas, 3-count coconuts&bananas");
        int index = scanner.nextInt();
        Branches randomBranches = new Branches();
        Branches branches = new Branches(10);
        BananaTree bananaTree = new BananaTree(3);
        CoconutTree coconutTree = new CoconutTree(7);

        MonkeyManager monkeyManager = new MonkeyManager(bananaTree, coconutTree);
        monkeyManager.chooseMonkey(index);
        System.out.println("==branches==");
        System.out.println("Random branches: " + randomBranches.getBranches());
        System.out.println("Branches: " + branches.getBranches());
    }
}
