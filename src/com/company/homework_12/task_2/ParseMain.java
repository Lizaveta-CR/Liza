package com.company.homework_12.task_2;

public class ParseMain {
    public static void main(String[] args) {
        Parse parse = integer -> integer + " RUB";
        String result = showRUB(parse, 4);
        System.out.println(result);
    }

    // showRub, и этот метод ничего не показывает, он парсит
    private static String showRUB(Parse parse, int value) {
        return parse.showRUB(value);
    }
}
