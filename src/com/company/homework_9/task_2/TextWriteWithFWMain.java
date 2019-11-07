package com.company.homework_9.task_2;

import java.io.*;

public class TextWriteWithFWMain {
    private static final String FILE_PATH = "src/com/company/homework_9/task_2/TextFileFW";

    public static void main(String[] args) {
        // этот try в отдельный метод
        createFile(FILE_PATH);
        // этот try тоже
        int of = 10000; // numberOFRec -> Of
        String text = "Hello from Java";
        writeFile(FILE_PATH,text,of);
    }

    public static void createFile(String fileName) {
        File file = new File(fileName);
        try {
            file.createNewFile();
        } catch (IOException e) {
            System.err.println("File can not be created" + e.getMessage());
        }
    }

    public static void writeFile(String fileName, String text, int of) {
        try (FileWriter fileWriter = new FileWriter(fileName);
             BufferedWriter buff = new BufferedWriter(fileWriter)) {

            for (int i = 0; i < of; i++) {
                buff.append(text);
                buff.write("\n");
            }
// пустая строка не нужна
            buff.flush();
            System.out.println("File has been successfully writen");
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
