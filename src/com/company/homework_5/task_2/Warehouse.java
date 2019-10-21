package com.company.homework_5.task_2;

import java.util.Arrays;

public class Warehouse {
    private int index = 0;
    private final Box[] boxes;

    public Warehouse(Box[] boxes) {
        this.boxes = boxes;
    }

    public Box next() {
        Box temp = null;
        if (boxes.length != 0) {
                temp = boxes[index + 1];
                index++;
                if (temp == boxes[boxes.length - 1]) {
                    temp = boxes[0];
                }
        }
        return temp;
    }

    public Box[] getArray() {
        Box[] arrayCopy = Arrays.copyOf(boxes, boxes.length);
        return arrayCopy;
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "boxes=" + Arrays.toString(boxes) +
                '}';
    }
}

