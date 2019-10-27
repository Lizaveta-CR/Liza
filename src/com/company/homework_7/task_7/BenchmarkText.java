package com.company.homework_7.task_7;

import java.io.IOException;

public class BenchmarkText {
    public static void main(String[] args) throws IOException {
        String string = "is being tested";
        StringBuffer stringBuffer = new StringBuffer("is being tested");
        StringBuilder stringBuilder = new StringBuilder("is being tested");

        testStrings(string);
        testStrings(stringBuffer);
        testStrings(stringBuilder);
    }

    public static void testStrings(String strings) {
        int iterationNumber = 100000;
        long start = System.currentTimeMillis();
        for (int i = 0; i < iterationNumber; i++) {
            strings = strings + "S";
        }
        long finish = System.currentTimeMillis();
        System.out.println(strings.getClass().getSimpleName() + "--" + (finish - start));

    }

    public static void testStrings(Appendable stringsToTests) throws IOException {
        int iterationNumber = 100000;
        long start = System.currentTimeMillis();
        for (int i = 0; i < iterationNumber; i++) {
            stringsToTests.append("S");
        }
        long finish = System.currentTimeMillis();
        System.out.println(stringsToTests.getClass().getSimpleName() + "--" + (finish - start));
    }
}
