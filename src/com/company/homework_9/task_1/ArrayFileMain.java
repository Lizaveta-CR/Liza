package com.company.homework_9.task_1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayFileMain {
    private static final String FILE_PATH = "src/com/company/homework_9/Arrayfile";

    public static void main(String[] args) {
        // старайся выносить код в отдельные методы
        int[] array = new int[5];
        writeFile(FILE_PATH, array);
    }

    public static void writeFile(String fileName, int[] ints) {
        try (FileOutputStream fos = new FileOutputStream(fileName)) {
            for (int i = 0; i < ints.length; i++) {
                ints[i] = (int) (Math.random() * 10);
            }
            fos.write(Arrays.toString(ints).getBytes());

            fos.flush();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
