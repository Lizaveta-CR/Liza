package com.company.homework_9.task_4;

import java.io.*;

public class ObjectMain {
    private static final String FILE_NAME = "src/com/company/homework_9/task_4/ObjectFile";

    public static void main(String[] args) {
        createFile(FILE_NAME);
        Employee liza = new Employee("Liza", 19, new Work("Student", 2));
        writeObjectToFile(liza, FILE_NAME);
        readObjectFromFile(liza, FILE_NAME);
    }

    public static void createFile(String fileName) {
        File file = new File(fileName);
        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println("Error in creating file" + e.getMessage());
        }
    }

    public static void writeObjectToFile(Object object, String fileName) {
        try (FileOutputStream fos = new FileOutputStream(fileName);
             ObjectOutputStream obs = new ObjectOutputStream(fos)) {
            obs.writeObject(object);
            obs.flush();
        } catch (FileNotFoundException e) {
            System.out.println("No such file" + e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readObjectFromFile(Object object, String fileName) {
        try (FileInputStream fis = new FileInputStream(fileName);
             ObjectInputStream obis = new ObjectInputStream(fis)) {
            Object obj = (Object) obis.readObject();
            System.out.println(obj);
        } catch (ClassNotFoundException | FileNotFoundException e) {
            System.err.println(e.getMessage());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
