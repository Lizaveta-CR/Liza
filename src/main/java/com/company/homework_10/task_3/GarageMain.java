package com.company.homework_10.task_3;

// +
public class GarageMain {
    public static void main(String[] args) {
        Car[] cars = new Car[]{new BMW(123), new Lada(775)};
        Garage<Lada> parkLada = new Garage<>(new Lada[]{new Lada(321)});
        Garage<BMW> parkBmw = new Garage<>(new BMW[]{new BMW(123)});
        Garage<Car> parkCars = new Garage<>(cars);
        System.out.println(parkLada);
        System.out.println(parkBmw);
        System.out.println(parkCars);
    }
}
