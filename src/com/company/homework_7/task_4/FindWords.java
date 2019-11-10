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
        String[] wordsArray = {"alert", "add", "good", "plan"};

        //  System.out.println("badword count: " + (length - sentenceEntered.replace(badword,"").length() / badwordLength));


        int count = 0;
        int index = 0;
        for (int i = 0; i < wordsArray.length; i++) {
            do {
                index = textLow.indexOf(wordsArray[i], index + 1);
                count++;
            }
            while (index != -1);
        }
    }
}

/*
No such word as 'alert'
Word 'add' repeates 1 time(s)
Word 'good' repeates 2 time(s)
Word 'plan' repeates 3 time(s)
Это вывод твоей программы, но она работает некорректно, т.к. слова 'good', 'plan', 'add' встречаются по одному разу
я думаю здесь нужен while цикл внутри первого for и искать по тексту пока не вернет индекс -1
*/
