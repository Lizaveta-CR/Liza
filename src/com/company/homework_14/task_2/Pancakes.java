package com.company.homework_14.task_2;

import java.io.*;

/*
Есть текстовый файл. Нужно скопировать из него только те строки, которые содержат слово pancakes и записать их в другой файл
 */
public class Pancakes {
    private static final String PATH_OLD = "src/com/company/homework_14/task_2/FileWithPancakes";
    private static final String PATH_NEW = "/Users/elizaveta/IdeaProjects/Liza/src/com/company/homework_14/task_2/NewPancakes";

    public static void main(String[] args) {
        createFile(PATH_NEW);
        readPancakesFromFile(PATH_OLD, PATH_NEW);
    }

    private static void readPancakesFromFile(String filePathOld, String filePathNew) {
        try (FileReader fileReader = new FileReader(filePathOld);
             BufferedReader bufferedReader = new BufferedReader(fileReader);
             FileWriter fileWriter = new FileWriter(filePathNew, true);
        ) {
            String pancakes;
            while ((pancakes = bufferedReader.readLine()) != null) {
                if (pancakes.toLowerCase().contains("pancakes")) {
                    fileWriter.write(pancakes + "\n");
                }
            }
        } catch (IOException e) {
            System.err.println("Error in reading" + e.getMessage());
        }
    }

    public static void createFile(String fileName) {
        File file = new File(fileName);
        try {
            file.createNewFile();
        } catch (IOException e) {
            System.err.println("Error in creating file" + e.getMessage());
        }
    }
}
