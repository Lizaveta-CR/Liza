package com.company.homework_16.task_3;

// +
public class ToysStore {
    private int numOfToys;

    public synchronized void putToy() {
        numOfToys++;
    }

    public int getNumOfToys() {
        return numOfToys;
    }

    @Override
    public String toString() {
        return "ToysStore{" +
                "numOfToys=" + numOfToys +
                '}';
    }
}
