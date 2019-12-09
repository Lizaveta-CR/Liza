package com.company.homework_6.task_2;

public class Car {
    private String number;
// 'start' - это поле класса Engine, здесь ты у поля 'engine' можешь вызвать метод 'isStarted()' например   
    private boolean start = false;
    private Engine engine;
    private Transmission transmission;

    // я бы Transmission & Engine тож передавал в конструкторе
    public Car(String number) {
        this.number = number;
        this.engine = new Engine();
        this.transmission = new Transmission();
    }

    public void gas() {
        // лучше не использовать отрицание в if(), а поменять местами if/else
        if (!start) {
            System.out.println("Let's go!");
        } else {
            System.out.println("Release the pedal!");
        }
    }

    public void move() {
        if (!start) {
            transmission.turnOnTheEngine();
            engine.increaseGear();
            gas();
        }
    }

    public void acceleration() {
        if (!start) {
            engine.increaseGear();
            gas();
        }
    }


    // по идее метод stop() должен понижать передачу до нулевой, а выключать двигатель - отдельный вызов метода
    // start - если делая 'start = true' ты хотела выключить двигательно, то это нелогично
    public void stop() {
        if (!start) {
            start = true;
            gas();
            engine.decreaseGear();
            transmission.shutOffTheEngine();
        }
    }

    public int getSpeed() {
        return engine.getCurrentGear() * 20;
    }

    @Override
    public String toString() {
        return "Car: " +
                "number= " + number;
    }
}
