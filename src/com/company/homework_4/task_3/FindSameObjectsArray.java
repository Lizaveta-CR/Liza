package com.company.homework_4.task_3;

import com.company.homework_4.task_1.Person;

public class FindSameObjectsArray {
    public static void main(String[] args) {
        int count = 0;
        Person[] people = new Person[7];

        people[0] = new Person("Helen", 33);
        people[1] = people[0];
        people[2] = new Person("Oleg", 30);
        people[3] = new Person();
        people[4] = people[2];
        people[5] = people[3];
        people[6] = new Person("Gled", 18);

        for (int i = 0; i < people.length; i++) {
            for (int j = i + 1; j < people.length; j++) {
                if (people[i].equals(people[j])) {
                    count++;
                    System.out.println("Position: " + i + " -> " + j);
                    people[i].show();
                    people[j].show();
                }
            }
        }
        System.out.println("The number of identical objects: " + count);
    }
}
