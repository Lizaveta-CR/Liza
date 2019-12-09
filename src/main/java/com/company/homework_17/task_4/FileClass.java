package com.company.homework_17.task_4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.concurrent.Callable;

// Integer -> объект с именем файла и кол-вом слов
public class FileClass implements Callable<Integer> {
    private String fileName;

    public FileClass(String fileName) {
        this.fileName = fileName;
    }


    @Override
    public Integer call() throws Exception {
        String[] words = null;
        int wordsCont = 0;

        FileReader fr = new FileReader(fileName);

        BufferedReader bf = new BufferedReader(fr);

        String string;
        while ((string = bf.readLine()) != null) {
            words = string.split(" ");
            wordsCont = wordsCont + words.length;
        }
        fr.close(); // метод close нельзя вызывать просто вот так, обязательно в finally или используй try-with-resources
        /*
        try () {
        }
        */
        return wordsCont;
    }
}
