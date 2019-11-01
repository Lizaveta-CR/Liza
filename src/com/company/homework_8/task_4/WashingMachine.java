package com.company.homework_8.task_4;

public class WashingMachine {
    private PowerBlock powerBlock;
    boolean electricity = true;
    private String name;

    public WashingMachine(String name, PowerBlock powerBlock) {
        this.name = name;
        this.powerBlock = powerBlock;
    }

    public void work() throws WashingMachineException {
        try {
            while (electricity) {
                System.out.println("Electricity is on");
                // 100 в константу
                if (powerBlock.getPower() > 100) {
                    throw new WashingMachineException("Something is broken,I'm sorry...");
                } else {
                    System.out.println("All right!");
                }
                // у тебя цикл всегда отработает только 1 раз либо будет исключение, если идея была такой, то ок
                electricity = false;
            }
        } catch (WashingMachineException e) {
            throw new WashingMachineException("Something is broken,I'm sorry...");
        } finally {
            // осталось только создать метод слива воды
            System.out.println("Water is flowing");
        }
    }

    @Override
    public String toString() {
        return "CarWasher{" +
                "powerBlock=" + powerBlock +
                ", electricity=" + electricity +
                ", name='" + name + '\'' +
                '}';
    }
}
