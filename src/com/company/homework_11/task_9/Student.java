package com.company.homework_11.task_9;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private String name;
    private int age;
    private String faculty;

    public Student(String name, int age, String faculty) {
        this.name = name;
        this.age = age;
        this.faculty = faculty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    @Override
    public int compareTo(Student student) {
        int nameResult = this.name.compareTo(student.name);
        if (nameResult < 0) {
            return nameResult;
        }
        if (nameResult > 0) {
            return nameResult;
        }
        int facultyresult = this.getFaculty().compareTo(student.faculty);
        if (facultyresult < 0) {
            return facultyresult;
        }
        if (facultyresult > 0) {
            return facultyresult;
        }
        return this.age - student.getAge();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(name, student.name) &&
                Objects.equals(faculty, student.faculty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, faculty);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", faculty='" + faculty + '\'' +
                '}';
    }
}
