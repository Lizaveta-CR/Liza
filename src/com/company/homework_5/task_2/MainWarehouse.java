package com.company.homework_5.task_2;

public class MainWarehouse {
    public static void main(String[] args) {

        Warehouse warehouse = new Warehouse(new Box[]{
                new Box(22, 5.77, "A-29"),
                new Box(44, 6.77, "B-29"),
                new Box(55, 8.77, "C-29"),
                new Box(19, 5.11, "D-29"),
                new Box(70, 9.77, "E-29")

        });
        System.out.println(warehouse);
        // для точной проверки цикл должен быть больше, чем array.length, т.к. метод next() ходит по кругу
        for (int i = 0; i < warehouse.getArray().length * 2; i++) {
            System.out.println(" Next element: " + warehouse.next());
        }
    }
}
