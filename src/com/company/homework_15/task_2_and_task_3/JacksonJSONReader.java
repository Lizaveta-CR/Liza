package com.company.homework_15.task_2_and_task_3;

import com.company.homework_15.entity.Student;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class JacksonJSONReader {
    private static final String FOLDER_PATH = "/Users/elizaveta/IdeaProjects/Liza/resource/json/Students";
    private static final String NEW_FILE_PATH = "src/com/company/homework_15/task_2_and_task_3/StudentList";
    private static final String NEW_JSON_FILE_PATH = "/Users/elizaveta/IdeaProjects/Liza/resource/json/output.json";

    public static void main(String[] args) throws IOException {
        List<Student> students = ListOfAllJson(FOLDER_PATH);
        writeListToFile(NEW_FILE_PATH, students);
        writeListToJsonFile(NEW_JSON_FILE_PATH, students);
    }

    private static Student readJSON(File fileName) throws IOException {
       // на каждый файл создается ObjectMapper, достаточно одного для всех
        ObjectMapper objectMapper = new ObjectMapper();
        Student student = objectMapper.readValue(new File(String.valueOf(fileName)), Student.class);
        return student;
    }

    // ListOfAllJson -> list...
    private static List<Student> ListOfAllJson(String dir) throws IOException {
        File f = new File(dir);
        File[] list = f.listFiles();
        List<Student> studentList = new ArrayList<>();
        for (File entry : list) {
            studentList.add(readJSON(entry));
        }
        Collections.sort(studentList, Comparator.comparing(Student::getName).thenComparing(Student::getSurname));
        return studentList;
    }

    private static void writeListToJsonFile(String fileName, List<Student> students) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        FileWriter fileWriter = new FileWriter(fileName);
        objectMapper.writeValue(fileWriter, students);
        System.out.println("File 'json' has been successfully written");
    }

    private static void writeListToFile(String fileName, List<Student> students) {
        try (FileWriter fileWriter = new FileWriter(new File(NEW_FILE_PATH));
             BufferedWriter buff = new BufferedWriter(fileWriter)) {
            buff.write(String.valueOf(students)); // не, записывать объект как строку вообще грустная история, не надо так делать
            buff.flush();
            System.out.println("File has been successfully written");
        } catch (IOException e) {
            System.out.println("Error in writing" + e.getMessage());
        }
    }

}
