package com.company.homework_9.task_2;

import java.io.*;

// +
public class TextWriteWithFOSMain {
    private static final String FILE_PATH = "src/com/company/homework_9/task_2/TextFile";

    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream(FILE_PATH);
             BufferedOutputStream buff = new BufferedOutputStream(fos)) {
            int numberOFRec = 10000;
            for (int i = 0; i < numberOFRec; i++) {
                buff.write(" Hello from Java".getBytes());
                buff.write("\n".getBytes());
            }
            buff.flush();
            System.out.println("File has been successfully written");
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
