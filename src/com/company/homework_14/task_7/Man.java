package com.company.homework_14.task_7;

import java.util.Arrays;

public class Man {
    private String name;
    private String surname;
    private int telNumber;

    public Man(String name, int telNumber) {
        // this(name, null, tellNumber)
        this.name = name;
        this.telNumber = telNumber;
    }

    public Man(String name, String surname, int telNumber) {
        this.name = name;
        this.surname = surname;
        this.telNumber = telNumber;
    }

    public Man(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    //    public Man(String name, String surname, int... telNumber) {
//        this.name = name;
//        if (telNumber == null) {
//            this.surname = surname;
//        } else {
//            if (surname.matches("(.)*(\\d)(.)*")) {
//                //дальше я не могу придумать,только если добавить новый конструктор
//                this.telNumber = Integer.parseInt(surname);
//            }
//        }
//    }

//    public Man(String name, int telNumber) {
//        this.name = name;
//        this.telNumber = telNumber;
//    }

    @Override
    public String toString() {
        return "Man{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", telNumber=" + telNumber +
                '}';
    }
}
