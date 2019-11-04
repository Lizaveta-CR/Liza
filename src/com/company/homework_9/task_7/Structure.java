package com.company.homework_9.task_7;

import java.io.File;

public class Structure {
    private static final String FILE_PATH = "src";

    public static void main(String[] args) {
        File file = new File(FILE_PATH);
        try {
            if (file.isDirectory()) {
                readFiles(file);
            } else throw new DirectoryNotFoundException("No such file referred to as directory");
        } catch (DirectoryNotFoundException e) {
            System.err.println("No such file referred to as directory" + e.getMessage());
        }
    }

    public static void readFiles(File directory) {
        for (File file : directory.listFiles()) {
            if (file.isFile()) {
                System.out.println("File: " + file.getName());
            } else {
                System.out.println("Catalog: " + file.getName());
                readFiles(file);
            }
        }
    }
}
