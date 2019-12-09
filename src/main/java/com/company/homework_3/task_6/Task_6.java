package com.company.homework_3.task_6;

import java.util.Arrays;

public class Task_6 {
    public static void main(String[] args) {
        int size = 10;
        int counter = 0;
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }

        System.out.println("Original array: ");
        System.out.println(Arrays.toString(array));

        int[] arrayEvenAndZeros = new int[size];

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                arrayEvenAndZeros[i] = array[i];
                counter += 1; // counter++;
            }
        }
        System.out.println("\nArray with even numbers and zeros: ");
        System.out.println(Arrays.toString(arrayEvenAndZeros));

        int[] arrayEven = new int[counter];
        int index = 0;
        for (int i = 0; i < arrayEvenAndZeros.length; i++) {
            if (arrayEvenAndZeros[i]!= 0) {
                arrayEven[index] = arrayEvenAndZeros[i];
                index++;
            }
        }
        System.out.println("\nFinal result: ");
        System.out.println(Arrays.toString(arrayEven));/*иногда в результате проскакивает 0 на последнем
        месте(добавляется +1 элемент,те увеличивается размерность),но я не смогла понять причину*/
        
        // ты уже знаешь что делать
    }
}

