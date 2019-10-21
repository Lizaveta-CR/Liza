package com.company.homework_5.task_3;

public interface House {

    int getNumberOfFloors();

    // дефолт методы обычно идут в конце 
    default void turnOnHeating() {
        System.out.println("Heating is on");
    }

    int getNumberOfTenants();

    void show();
}
