package com.company.homework_5.task_3;

// +
public class CityHouse implements House {
    private int floors;
    private int tenants;

    public CityHouse(int floors, int tenants) {
        this.floors = floors;
        this.tenants = tenants;
    }

    @Override
    public int getNumberOfFloors() {
        return floors;
    }

    @Override
    public int getNumberOfTenants() {
        return tenants;
    }

    @Override
    public void show() {
        System.out.println("Number of floors: " + floors + ", Number of tenants: " + tenants);
    }
}
