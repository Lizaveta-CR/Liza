package com.company.homework_6.task_2;

// в целом гуд
public class CarMain {
    public static void main(String[] args) {
        Car car = new Car("7273");
        System.out.println(car);
        System.out.println("==moving==");
        car.move();
        System.out.println("Current speed = " + car.getSpeed() + "\n");
        System.out.println("\n==acceleration==");
        car.acceleration();
        System.out.println("Speed = " + car.getSpeed());
        System.out.println("\n==break==");
        car.stop();
    }
}
