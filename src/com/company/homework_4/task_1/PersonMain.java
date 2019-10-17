package com.company.homework_4.task_1;

public class PersonMain {
    public static void main(String[] args) {
        Person person_1 = new Person("Kate", 18);
        Person person_2 = new Person("Oleg", 22);
        Person person_3 = new Person();

        person_1.show();
        person_2.show();
        person_3.show();

        System.out.println("==getting name==");
        System.out.println(person_1.getName());
        System.out.println(person_2.getName());
        System.out.println(person_3.getName());

        System.out.println("==getting age==");
        System.out.println(person_1.getAge());
        System.out.println(person_2.getAge());
        System.out.println(person_3.getAge());
    }
}
