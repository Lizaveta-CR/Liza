package com.company.homework_15.entity;

public class Subjects {
    private String subName;
    private int mark;

    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Subjects{" +
                "subName='" + subName + '\'' +
                ", mark=" + mark +
                '}';
    }
}
