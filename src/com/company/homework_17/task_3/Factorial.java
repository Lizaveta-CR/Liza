package com.company.homework_17.task_3;

import java.util.concurrent.Callable;

// Integer -> Long
public class Factorial implements Callable<Long> {
    private int begin;
    private int end;

    public Factorial(int begin, int end) {
        this.begin = begin;
        this.end = end;
    }

    @Override
    public Long call() {
        long result = (long) begin;
        for (int i = begin + 1; i <= end; i++) {
            result = result * i;
        }
        return result;
    }
}
