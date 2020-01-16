package com.company.javaEE.task_1;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Task {
    public static void main(String[] args) {
        String stopWord = "stop";
        boolean flag = true;
        List<String> words = new ArrayList<>();
        System.out.println("Remember: if you want to stop, just write 'stop'");
        Scanner scanner = new Scanner(System.in);
        while (flag) {
            System.out.println("Enter word: ");
            String answer = scanner.nextLine();
            try {
                String checked = checking(answer);
                if (checked.equals(stopWord)) {
                    findMaxAndMin(words);
                    flag = false;
                } else {
                    words.add(checked);
                }
            } catch (MyCustomException e) {
                System.err.println(e);
            }
        }
    }

    public static String checking(String enteredWord) throws MyCustomException {
        Pattern p = Pattern.compile("[0-9]");
        Matcher m = p.matcher(enteredWord);
        boolean b = m.find();
        if (b) {
            throw new MyCustomException("Try again,not a word");
        } else {
            return enteredWord;
        }
    }

    private static Map<String, Long> countWords(List<String> wordsList) {
        Map<String, Long> totalMap = new HashMap<>();
        wordsList.forEach((word) -> {
            Map<String, Long> frequentChars = Arrays.stream(
                    word.toLowerCase().split("")).collect(
                    Collectors.groupingBy(c -> c, Collectors.counting()));
            frequentChars.forEach((key, value) -> totalMap.merge(key, value, (v1, v2) -> v1 == v2 ? v1 : v1 + v2));
        });
        return totalMap;
    }

    private static void findMaxAndMin(List<String> wordsList) {
        Map<String, Long> stringLongMap = countWords(wordsList);
        Long minValueInMap = (Collections.min(stringLongMap.values()));
        Long maxValueInMap = (Collections.max(stringLongMap.values()));
        for (Map.Entry<String, Long> entry : stringLongMap.entrySet()) {
            if (entry.getValue() == maxValueInMap) {
                System.out.println("Letter " + entry.getKey() + " was in words " + entry.getValue() + " times");
            } else {
                if (entry.getValue() == minValueInMap) {
                    System.out.println("Letter " + entry.getKey() + " was in words " + entry.getValue() + " time");
                }
            }
        }
    }
}
