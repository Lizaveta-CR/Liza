package com.company.homework_5.task_1;

public interface Computer {
    void turnOff(); // я бы предложил сделать этот метод не void, а boolean, чтобы знать отработала кнопка или нет

    void turnOn(); // я бы предложил сделать этот метод не void, а boolean, чтобы знать отработала кнопка или нет

    void reset(); // здесь 'void' ok
}
