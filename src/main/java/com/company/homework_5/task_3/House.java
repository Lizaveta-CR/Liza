package com.company.homework_5.task_3;

public interface House {

    int getNumberOfFloors();

    int getNumberOfTenants();

    default void turnOnHeating() {
        System.out.println("Heating is on");
    }
}
