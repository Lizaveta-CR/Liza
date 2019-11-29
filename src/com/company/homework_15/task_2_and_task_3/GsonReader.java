package com.company.homework_15.task_2_and_task_3;

import com.company.homework_15.entity.Student;
import com.google.gson.Gson;

import java.io.*;

public class GsonReader {
    public static void main(String[] args) throws IOException {
        showAllJson("/Users/elizaveta/IdeaProjects/Liza/resource/json");
    }

    public static void readJSON(File fileName) {
        Gson gson = new Gson();
        try (FileReader fr = new FileReader(fileName)) {
            Student student = gson.fromJson(fr, Student.class);
            System.out.println(student);
        } catch (IOException e) {
            System.out.println("Problem in reading" + e.getMessage());
        }
    }

    private static void showAllJson(String dir) {
        File f = new File(dir);
        File[] list = f.listFiles();

        if (list == null) {
            return;
        }
        for (File entry : list) {
            readJSON(entry);
        }
    }
}
