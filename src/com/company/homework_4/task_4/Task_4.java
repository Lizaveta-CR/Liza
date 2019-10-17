package com.company.homework_4.task_4;

import com.company.homework_4.task_1.Person;

public class Task_4 {
    public static void main(String[] args) {
        Person people_1 = new Person();
        Person people_2 = new Person("Helena", 22);
        people_1.setText("Hello from objects");

        people_1.printText();
        people_2.printText();//переопределив в одном,переопределяется во всех
    }
}
