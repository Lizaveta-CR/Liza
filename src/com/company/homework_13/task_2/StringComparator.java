package com.company.homework_13.task_2;

import java.util.Comparator;

// не стоит заводить новый класс, когда можно использовать базовый от java
public class StringComparator implements Comparator<String> {
    @Override
    public int compare(String firstStr, String secondStr) {
        return firstStr.length()-secondStr.length();
    }
}
