package com.company.homework_5.task_3;

public class HouseMain {
    public static void main(String[] args) {
        HouseCatalog houses = new HouseCatalog(new CityHouse[]{new CityHouse(10, 100)}, new VacationHome[]{
                new VacationHome(2, 3)
        });
        System.out.println("Show house catalog: ");
        for (int i = 0; i < houses.getArrayCities().length; i++) {
            System.out.println(houses.getArrayCities()[i]);
            for (int j = i; j < houses.getArrayVacation().length; j++) {
                System.out.println(houses.getArrayVacation()[i]);
                //не понимаю,почему все равно возвращает "ссылочный вариант",хоть и сделана копия массива
            }
            System.out.println("==City==");
            CityHouse cityHouse = new CityHouse(10, 100);
            cityHouse.show();
            System.out.println(cityHouse.getNumberOfFloors() + "\n" + cityHouse.getNumberOfTenants());
            cityHouse.turnOnHeating();

            System.out.println("==Village==");
            VacationHome vacationHome = new VacationHome(2, 4);
            vacationHome.show();
            System.out.println(vacationHome.getNumberOfFloors() + "\n" + vacationHome.getNumberOfTenants());
            vacationHome.turnOnHeating();

        }
    }
}