package com.company.homework_8.task_3;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayException {
    public static void main(String[] args) throws MyCustomException {
        Boolean flag = true;
        while (flag) {
            System.out.println("Please enter array dimension: ");
            Scanner scanner = new Scanner(System.in);
            int size = scanner.nextInt();
            try {
                if (size > 0 && size < 10) {
                    int[] array = new int[size];
                    for (int i = 0; i < size; i++) {
                        array[i] = (int) (Math.random() * 10);
                    }
                    System.out.println(Arrays.toString(array));
                } else {
                    throw new IndexOutOfBoundsException("Error in array dimension");
                }
            } catch (IndexOutOfBoundsException e) {
                throw new MyCustomException("Error in array dimension");
            }
            flag=false;
        }
    }//я не разобралась,что мне надо добавить,чтобы после Exception просило ввести еще раз.
}
