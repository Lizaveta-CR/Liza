package com.company.homework_6.task_3;

public class BananaTree {
    private int bananas;

    public BananaTree(int bananas) {
        this.bananas = bananas;
    }

    public int getBananas() {
        return bananas;
    }

    @Override
    public String toString() {
        return "BananaTree{" +
                "bananas=" + bananas +
                '}';
    }
}
