package com.company.homework_9.task_3;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TextReadFOSMain {
    private static final String FILE_PATH = "src/com/company/homework_9/task_2/TextFile";

    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream(FILE_PATH);
             BufferedInputStream buff = new BufferedInputStream(fis)) {
            int data; // int string - выглядить странно
            while ((data = buff.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found" + e.getMessage());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
