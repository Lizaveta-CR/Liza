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
                // Ответ: для этого в классе VacationHome должен быть переопределен метод toString(), метод show() тогда можно будет убрать
            }
            
            // 1
            System.out.println("==City==");
            CityHouse cityHouse = new CityHouse(10, 100);
            cityHouse.show();
            System.out.println(cityHouse.getNumberOfFloors() + "\n" + cityHouse.getNumberOfTenants());
            cityHouse.turnOnHeating();

            // 2
            System.out.println("==Village==");
            VacationHome vacationHome = new VacationHome(2, 4);
            vacationHome.show();
            System.out.println(vacationHome.getNumberOfFloors() + "\n" + vacationHome.getNumberOfTenants());
            vacationHome.turnOnHeating();

            // 1 и 2 делают одно и тоже, думаю это хороший признак чтобы вынести эту логику в отдельный метод
        }
    }
}
