package com.company.homework_15.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.json.JSONPropertyName;

import java.util.List;

public class Student {
    private String id;
    private String name;
    private String surname;
    private String faculty;
    @JsonProperty("favSubject")
    private List<Subjects> favSubject;
    private int groupNum;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getGroupNum() {
        return groupNum;
    }

    public List<Subjects> getFavSubject() {
        return favSubject;
    }

    public void setFavSubject(List<Subjects> favSubject) {
        this.favSubject = favSubject;
    }

    public void setGroupNum(int groupNum) {
        this.groupNum = groupNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", faculty='" + faculty + '\'' +
                ", favSubject=" + favSubject +
                ", groupNum=" + groupNum +
                '}';
    }
}
