package com.company.homework_5.task_2;

import java.util.Arrays;

public class Warehouse {
    private int index = 0;
    private final Box[] boxes;

    public Warehouse(Box[] boxes) {
        this.boxes = boxes;
    }

    public Box next() {
        Box tempIndex = null;
        if (boxes.length > 0) {
            tempIndex = boxes[index];
            index++;
            if (index == boxes.length - 1) {
                index = 0;
            }
        }
        return tempIndex;
    }

    public Box[] getArray() {
        Box[] arrayCopy = Arrays.copyOf(boxes, boxes.length);
        return arrayCopy;
    }

    @Override
    public String toString() {
        return "FruitsWarehouse{" +
                "boxes=" + Arrays.toString(boxes) +
                '}';
    }
}

