package com.company.homework_7.task_8;

public class CarWarehouse {
    public static void main(String[] args) {
        CarEngine[] carEngines = {new CarEngine("1.4"), new CarEngine("1.8")};
        for (int i = 0; i < carEngines.length; i++) {
            if (carEngines[i].getNumber().equals("1.4")) {
                carEngines[i] = new CarEngine(carEngines[i].getNumber().replace("1.4", "2.0T"));
                System.out.println(carEngines[i]);
            } else {
                carEngines[i] = new CarEngine(carEngines[i].getNumber().replace("1.8", "1.8T"));
                System.out.println(carEngines[i]);
            }
        }
    }
}
