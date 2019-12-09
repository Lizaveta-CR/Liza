package com.company.homework_7.task_7;

import java.io.IOException;

public class BenchmarkText {
    public static void main(String[] args) throws IOException {
        String string = "is being tested";
        StringBuffer stringBuffer = new StringBuffer("is being tested");
        StringBuilder stringBuilder = new StringBuilder("is being tested");

        testStrings(string,10000);
        testStrings(stringBuffer,10000);
        testStrings(stringBuilder,10000);
    }

    public static void testStrings(String strings,int iterationNumber ) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < iterationNumber; i++) {
            strings = strings + "S";
        }
        long finish = System.currentTimeMillis();
        System.out.println(strings.getClass().getSimpleName() + "--" + (finish - start));

    }

    // testStrings(Appendable stringsToTests) -> Appendable вот за это молодец, 
    // stringsToTests - toTest, strings это строки, может сбивать с толку
    public static void testStrings(Appendable ToTests,int iterationNumber) throws IOException {
        long start = System.currentTimeMillis();
        for (int i = 0; i < iterationNumber; i++) {
            ToTests.append("S");
        }
        long finish = System.currentTimeMillis();
        System.out.println(ToTests.getClass().getSimpleName() + "--" + (finish - start));
    }
}
