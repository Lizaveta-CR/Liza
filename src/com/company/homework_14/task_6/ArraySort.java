package com.company.homework_14.task_6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArraySort {
    public static void main(String[] args) {
        int[] firstArray = {0, 1, 2, 3, 6, 10};
        int[] secondArray = {1, 4, 6, 9};
        System.out.println(Arrays.toString(mergeArrays(firstArray, secondArray)));
    }

    private static int[] mergeArrays(int[] firstArray, int[] secondArray) {
        int[] totalArray = new int[firstArray.length + secondArray.length];
        int firstIndex = 0;
        int secondIndex = 0;
        int totalIndex = 0;
        while (firstIndex < firstArray.length && secondIndex < secondArray.length) {
            if (firstArray[firstIndex] < secondArray[secondIndex]) {
                totalArray[totalIndex] = firstArray[firstIndex];
                totalIndex++;
                firstIndex++;
            } else {
                totalArray[totalIndex] = secondArray[secondIndex];
                totalIndex++;
                secondIndex++;
            }
            // totalIndex++;
        }
        // этот цикл выглядит очень странно
        while (firstIndex < firstArray.length) {
            totalArray[totalIndex] = firstArray[firstIndex];
            totalIndex++;
            firstIndex++;
        }
        // этот цикл выглядит очень странно, как минимум стоить вынести в отдельный метод
        while (secondIndex < secondArray.length) {
            totalArray[totalIndex] = secondArray[secondIndex];
            totalIndex++;
            secondIndex++;
        }
        // дубликаты удалять не нужно
        return removeDuplicates(totalArray);
    }

    private static int[] removeDuplicates(int[] array) {
        Set<Integer> set = new HashSet<>();
        int length = array.length;
        int temp[] = new int[length];
        int index = 0;
        for (int i : array) {
            if (set.add(i)) {
                temp[index++] = i;
            }
        }
        return Arrays.copyOfRange(temp, 0, index);
    }
}
