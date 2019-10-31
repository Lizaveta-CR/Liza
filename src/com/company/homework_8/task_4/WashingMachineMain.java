package com.company.homework_8.task_4;

public class WashingMachineMain {
    public static void main(String[] args) throws WashingMachineException {
        PowerBlock powerBlock_1 = new PowerBlock(20);
        PowerBlock powerBlock_2 = new PowerBlock(200);
        WashingMachine washingMachine_1 = new WashingMachine("CM-2020", powerBlock_1);
        WashingMachine washingMachine_2 = new WashingMachine("CM-2019", powerBlock_2);
        washingMachine_1.work();
        System.out.println("===");
        washingMachine_2.work();
    }
}
