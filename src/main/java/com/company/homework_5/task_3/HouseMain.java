package com.company.homework_5.task_3;

public class HouseMain {
    public static void main(String[] args) {

        House cityHouse = new CityHouse(10, 100);
        System.out.println(cityHouse + " \nTenants: " + cityHouse.getNumberOfTenants() + " \nFloors: " + cityHouse.getNumberOfFloors());
        cityHouse.turnOnHeating();
        System.out.println("==Village==");
        House vacationHome = new VacationHome(2, 5);
        System.out.println(vacationHome + " \nTenants: " + vacationHome.getNumberOfTenants() + " \nFloors: " + vacationHome.getNumberOfFloors());
        cityHouse.turnOnHeating();
    }
}
