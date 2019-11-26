package com.company.homework_14.task_5;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CatMain {
    private static final String PATH = "src/com/company/homework_14/task_5/Cats";

    public static void main(String[] args) {
        List<Cat> cats = addCats();
        writeListToFile(PATH, cats);
        readListFromFile(PATH);
        checkNull(cats);
    }

    private static List<Cat> addCats() {
        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat("Siamese", 3));
        cats.add(new Cat("Sphynx", 6));
        cats.add(null);
        return cats;
    }

    private static void writeListToFile(String fileName, List<Cat> cats) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(cats);
        } catch (IOException e) {
            System.out.println("File hasn't been written");
        }
    }

    private static void readListFromFile(String fileName) {
        ArrayList<Cat> newCats;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            newCats = (ArrayList<Cat>) ois.readObject();
            for (Cat newCat : newCats) {
                System.out.println(newCat);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error in reading");

        }
    }

    private static void checkNull(List<Cat> cats) {
        int count = 0;
        for (Cat cat : cats) {
            if (cat == null) {
                count++;
            }
        }
        System.out.println("There is(are) " + count + " null element(s)");
    }
}
