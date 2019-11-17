package com.company.homework_11.task_9;

import java.util.Set;
import java.util.TreeSet;

// +
public class TreeSetStudent {
    public static void main(String[] args) {
        Set<Student> students = new TreeSet<>();
        students.add(new Student("Liza", 19, "MMF"));
        students.add(new Student("Pasha", 18, "MMF"));
        students.add(new Student("Liza", 20, "MMF"));
        students.add(new Student("Pasha", 17, "FIR"));

        System.out.println(students);
    }
}
