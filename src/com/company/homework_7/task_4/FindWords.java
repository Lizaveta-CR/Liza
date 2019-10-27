package com.company.homework_7.task_4;

public class FindWords {
    public static void main(String[] args) {
        String text = "While major gameplay components are already in place and functioning,\n" +
                "players help is needed to add some of the smaller features and content.\n" +
                "Of course polishing the overall experience is important at the same time.\n" +
                "Game has been extensively tested in closed group, but it is always important to hear fresh suggestions\n" +
                "from larger crowd that come from various gaming backgrounds.\n" +
                "Plan is to make the game as good as possible but without compromising the core idea.";

        String textLow = text.toLowerCase();
        String[] wordsArray = new String[]{"alert", "add", "good", "plan"};

        int count = 0;

        for (int i = 0; i < wordsArray.length; i++) {
            String word = wordsArray[i];
            int index = textLow.indexOf(word);
            if (index != -1) {
                count++;
                System.out.println("Word '" + wordsArray[i] + "' repeates " + count + " time(s)");
            } else {
                System.out.println("No such word as '" + wordsArray[i] + "'");
            }
        }
    }
}
