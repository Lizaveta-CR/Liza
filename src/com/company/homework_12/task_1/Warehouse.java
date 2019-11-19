package com.company.homework_12.task_1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Warehouse {
    public static void main(String[] args) throws InterruptedException {
        // у коробки стоило сделать поле timeAdded и сетать его перед добавлением в хранилище
        Set<Box> boxes = new HashSet<>();

        boxes.add(new Box("Books"));
        LocalDateTime booksTime = LocalDateTime.now();
        System.out.println("First box was added on " + booksTime);

        boxes.add(new Box("Telephones"));
        System.out.println("Please wait, we need to check access...");
        Thread.sleep(12358);
        LocalDateTime telephonesTime = LocalDateTime.now();
        System.out.println("Second box was added on " + telephonesTime);
    }
}
