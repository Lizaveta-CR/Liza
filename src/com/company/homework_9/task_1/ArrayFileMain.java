package com.company.homework_9.task_1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ArrayFileMain {
    private static final String FILE_PATH = "src/com/company/homework_9/Arrayfile";

    public static void main(String[] args) {

        // старайся выносить код в отдельные методы
        try (FileOutputStream fos = new FileOutputStream(FILE_PATH, true)) {
            int[] array = new int[5];
            for (int i = 0; i < array.length; i++) {
                array[i] = (int) (Math.random() * 10);
                fos.write(array[i]);
            }
            fos.flush();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

        try (FileInputStream fis = new FileInputStream(FILE_PATH)) {
            int data;
            while ((data = fis.read()) != -1) {
                System.out.print(data);
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
