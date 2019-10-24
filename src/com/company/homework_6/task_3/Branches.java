package com.company.homework_6.task_3;

public class Branches {
    private int branches;

    public Branches() {
        branches = (int) (Math.random() * 10);
    }

    public Branches(int branches) {
        this.branches = branches;
    }

    public int getBranches() {
        return branches;
    }

    @Override
    public String toString() {
        return "Branches{" +
                "branches=" + branches +
                '}';
    }
}
