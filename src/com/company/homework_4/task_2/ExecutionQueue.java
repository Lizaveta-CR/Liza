package com.company.homework_4.task_2;

// +
public class ExecutionQueue {
    private static String msg;

    static {
        msg = "static block";//работает первым
    }

    {
        msg = "regular init block";//второй(не важна последовательность)
    }

    public ExecutionQueue() {
        msg = "constructor value";//работает последним
    }

    public static void main(String[] args) {
        ExecutionQueue executionQueue = new ExecutionQueue();

        System.out.println(executionQueue.msg);
    }

}
