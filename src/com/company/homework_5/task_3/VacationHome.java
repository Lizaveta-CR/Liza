package com.company.homework_5.task_3;

// +
public class VacationHome implements House {
    private int floors;
    private int tenants;

    public VacationHome(int floors, int tenants) {
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
    public String toString() {
        return "VacationHome: " +
                "floors= " + floors +
                " tenants= " + tenants;
    }
}
