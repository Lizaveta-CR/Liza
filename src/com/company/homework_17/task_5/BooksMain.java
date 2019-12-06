package com.company.homework_17.task_5;

import com.company.homework_17.entity.Book;
import com.company.homework_17.entity.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class BooksMain {
    public static void main(String[] args) {
        List<Student> students = getStudents();
        //я не понимаю,как это сделать,ибо так не работает:
//        Map<Book,Integer> books=students.stream()
//                .map(Student::getBook)
//                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

    }

    private static List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Pasha", new Book[]{new Book("The theory of everything", 2011), new Book("Harry", 2001)}));
        students.add(new Student("Masha", new Book[]{new Book("The theory of everything", 2011), new Book("Math", 1905)}));
        students.add(new Student("Olya", new Book[]{new Book("The Philosophy of Java", 1995), new Book("Einstein", 2001)}));
        students.add(new Student("Sasha", new Book[]{new Book("Sherlock Holmes", 1895), new Book("Harry", 2001)}));
        students.add(new Student("Nikita", new Book[]{new Book("Math", 1905), new Book("Sherlock Holmes", 1895)}));
        students.add(new Student("Oleg", new Book[]{new Book("Sherlock Holmes", 1895), new Book("The theory of everything", 2011)}));
        students.add(new Student("Liza", new Book[]{new Book("The Philosophy of Java", 1995), new Book("Math", 1905)}));
        return students;
    }
}
