package com.company.homework_9.task_6;

import java.io.*;

public class MessageIntoPictureMain {
    private static final String FILE_PATH = "src/com/company/homework_9/task_6/picture.jpg";
    private static String message = " zero factorial is equal to one ";

    public static void main(String[] args) {
        createFile(FILE_PATH);
        writeMessageToFile(message, FILE_PATH);
        readMessageFromFile(FILE_PATH);
    }

    public static void createFile(String fileName) {
        File file = new File(fileName);
        try {
            file.createNewFile();
        } catch (IOException e) {
            System.err.println("Error in creating file" + e.getMessage());
        }
    }

    public static void writeMessageToFile(String message, String FILE_PATH) {
        try (FileWriter fos = new FileWriter(FILE_PATH, true)) {
            fos.write(message);
            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("Error in writing" + e.getMessage());
        }
    }

    public static void readMessageFromFile(String FILE_PATH) {
        try (FileReader fileReader = new FileReader(FILE_PATH);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String secretMessage;
            while ((secretMessage = bufferedReader.readLine()) != null) {
                System.out.print(secretMessage);
            }
        } catch (IOException e) {
            System.err.println("Error in reading" + e.getMessage());
        }
    }
}