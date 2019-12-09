package com.company.homework_9.task_4;

import java.io.*;

public class ObjectMain {
    // FILE_PATH
    private static final String FILE_PATH = "src/com/company/homework_9/task_4/ObjectFile";

    public static void main(String[] args) {
        createFile(FILE_PATH);
        Employee liza = new Employee("Liza", 19, new Work("Student", 2));
        writeObjectToFile(liza, FILE_PATH);
        readObjectFromFile(FILE_PATH);
    }

    public static boolean createFile(String fileName) {
        File file = new File(fileName);
        try {
            file.createNewFile();
            return true;// этот метод возвращает boolean, я бы сделал твой void -> boolean
        } catch (IOException e) {
            System.out.println("Error in creating file" + e.getMessage());
            return false;
        }
    }

    public static void writeObjectToFile(Employee employee, String fileName) {
        try (FileOutputStream fos = new FileOutputStream(fileName);
             ObjectOutputStream obs = new ObjectOutputStream(fos)) {
            obs.writeObject(employee);
            obs.flush();
        } catch (FileNotFoundException e) {
            System.out.println("No such file" + e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // void -> Employee
    // зачем тебе аргумент Object object в методе?
    public static void readObjectFromFile(String fileName) {
        try (FileInputStream fis = new FileInputStream(fileName);
             ObjectInputStream obis = new ObjectInputStream(fis)) {
            Employee employee = (Employee) obis.readObject();
            // obis.readObject(); итак вернет Object, а тебе нужно будет скастить до Employee
           System.out.println(employee);
        } catch (ClassNotFoundException | FileNotFoundException e) {
            System.err.println(e.getMessage());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
