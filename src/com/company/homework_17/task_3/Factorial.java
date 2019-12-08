package com.company.homework_17.task_3;

import java.util.concurrent.Callable;

// Integer -> Long
public class Factorial implements Callable<Integer> {
    private int begin;
    private int end;

    public Factorial(int begin, int end) {
        this.begin = begin;
        this.end = end;
    }

    @Override
    public Integer call() throws Exception {
        int result = begin;
        for (int i = ++begin; i <= end; i++) {
            result = result * i;
        }
        return result;
    }
}
