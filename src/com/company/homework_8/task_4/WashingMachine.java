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
                if (powerBlock.getPower() > 100) {
                    throw new WashingMachineException("Something is broken,I'm sorry...");
                } else {
                    System.out.println("All right!");
                }
                electricity = false;
            }
        } catch (WashingMachineException e) {
            throw new WashingMachineException("Something is broken,I'm sorry...");
        } finally {
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
