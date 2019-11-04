package com.company.homework_9.task_3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TextReadFRMain {
    private static final String FILE_NAME = "src/com/company/homework_9/task_2/TextFileFW";

    public static void main(String[] args) {
        try (FileReader fileReader = new FileReader(FILE_NAME);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found" + e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
