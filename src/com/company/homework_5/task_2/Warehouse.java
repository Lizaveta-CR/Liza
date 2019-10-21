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
            /* 1. у тебя первый вызов метода next() вернет элемент с индексом 1, а должен с 0
            2. ты берешь index+1, т.е. ArrayIndexOutOfBoundsException тебе обеспечен:
            {22} - допустим твой массив. Здесь 1 элемент у которого индекс 0, а ты возьмешь 0+1 = 1 индекс, которого не существует
            */
                temp = boxes[index + 1]; 
                index++;
            // очень опасный if, подумай что будет если в массиве будут 2 одинаковых элемента
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

