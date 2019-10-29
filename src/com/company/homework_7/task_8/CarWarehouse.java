package com.company.homework_7.task_8;

public class CarWarehouse {
    public static void main(String[] args) {
        String fistToChange="1.4";
        String secondToChange="1.8";
        String secondChanged="2.0T";
        String firstChanged="1.8T";

        CarEngine[] carEngines = {new CarEngine(fistToChange), new CarEngine(secondToChange)};
        for (int i = 0; i < carEngines.length; i++) {
            if (carEngines[i].getNumber().equals(fistToChange)) { // 1.4 / 2.0T - в переменную или константу
                carEngines[i] = new CarEngine(carEngines[i].getNumber().replace(fistToChange, secondChanged));
                System.out.println(carEngines[i]);
            } else {
                carEngines[i] = new CarEngine(carEngines[i].getNumber().replace(secondToChange, firstChanged)); // 1.8 / 1.8T - в переменную или константу
                System.out.println(carEngines[i]);
            }
        }
    }
}
