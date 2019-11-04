package com.company.homework_9.task_2;

import java.io.*;

public class TextWriteWithFWMain {
    private static final String FILE_NAME = "src/com/company/homework_9/task_2/TextFileFW";

    public static void main(String[] args) {
        File file = new File(FILE_NAME);
        try {
            file.createNewFile();
        } catch (IOException e) {
            System.err.println("File can not be created" + e.getMessage());
        }

        try (FileWriter fileWriter = new FileWriter(FILE_NAME);
             BufferedWriter buff = new BufferedWriter(fileWriter)) {
            int numberOFRec = 10000;
            String text = "Hello from Java";
            for (int i = 0; i < numberOFRec; i++) {
                buff.append(" Hello from Java");
                buff.write("\n");
            }

            buff.flush();
            System.out.println("File has been successfully writen");
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
