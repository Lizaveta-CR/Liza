package com.company.homework_8.task_3;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayException {
    public static void main(String[] args) {
        Boolean flag = true; // я думаю здесь можно обойтись примитивом boolean
        while (flag) {
            System.out.println("Please enter array dimension: ");
            Scanner scanner = new Scanner(System.in);
            int size = scanner.nextInt();
            try {
                checking(size);
                // я бы предложил тебе проверку числа вынести в отдельный метод из которого выбрасывать исключение и затем создавать массив в main()
                    int[] array = new int[size];
                    for (int i = 0; i < size; i++) {
                        array[i] = (int) (Math.random() * 10);
                    }
                    System.out.println(Arrays.toString(array));
                flag = false;
            } catch (MyCustomException e) {
                System.out.println("Error in array dimension");
            }
        }
    }

    public static int checking(int number) throws MyCustomException {
        if (number > 0 && number < 10) {
            return number;
        } else{
            throw new MyCustomException("Error in array dimension");
        }
    }
}
