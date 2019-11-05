package com.company.homework_9.task_5;

import com.company.homework_9.task_4.Employee;
import com.company.homework_9.task_4.Work;

import java.io.*;

public class ObjectMain {
    private static final String FILE_NAME = "src/com/company/homework_9/task_4/ObjectFile";

    public static void main(String[] args) {
        //наверное,я что-то делаю не так,раз все работает,ибо изменив private->public все осталось так же
        // возможно я ошибся и изменение модификатора доступа не влияет
        readObjectFromFile(FILE_NAME);
    }

    // void -> Employee
    public static void readObjectFromFile(String fileName) {
        try (FileInputStream fis = new FileInputStream(fileName);
             ObjectInputStream obis = new ObjectInputStream(fis)) {
            Employee employee = (Employee) obis.readObject();
            System.out.println(employee);
        } catch (ClassNotFoundException | FileNotFoundException e) {
            System.err.println(e.getMessage());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
