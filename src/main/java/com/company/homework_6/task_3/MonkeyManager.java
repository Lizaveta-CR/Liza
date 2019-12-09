package com.company.homework_6.task_3;

public class MonkeyManager {
    private BananaTree bananaTree;
    private CoconutTree coconutTree;

    public MonkeyManager(BananaTree bananaTree, CoconutTree coconutTree) {
        this.bananaTree = bananaTree;
        this.coconutTree = coconutTree;
    }

    public void chooseMonkey(int index) {
        switch (index) {
            case 1:
                countFirstMonkey();
                break;
            case 2:
                countSecondMonkey();
                break;
            case 3:
                countThirdMonkey();
                break;
        }
    }

    private void countFirstMonkey() {
        System.out.println("Coconuts: " + coconutTree.getCoconuts());
    }

    private void countSecondMonkey() {
        System.out.println("Bananas: " + bananaTree.getBananas());
    }

    private void countThirdMonkey() {
        System.out.println("Coconuts: " + coconutTree.getCoconuts() + " Bananas: " + bananaTree.getBananas());
    }

    @Override
    public String toString() {
        return "MonkeyManager{" +
                "bananaTree=" + bananaTree.getBananas() +
                ", coconutTree=" + coconutTree.getCoconuts() +
                '}';
    }
}
