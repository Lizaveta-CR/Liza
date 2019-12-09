package com.company.homework_6.task_3;

public class CoconutTree {
    // думаю здесь должен быть массив чего-нибудь, например, веток
    private int coconuts;

    public CoconutTree(int coconuts) {
        this.coconuts = coconuts;
    }

    public int getCoconuts() {
        return coconuts;
    }

    @Override
    public String toString() {
        return "CoconutTree{" +
                "coconuts=" + coconuts +
                '}';
    }
}
