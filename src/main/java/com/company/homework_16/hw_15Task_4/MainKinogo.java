package com.company.homework_16.hw_15Task_4;

import java.util.List;

public class MainKinogo {
    public static void main(String[] args) throws Exception {
        String URL = "https://kinogo.by/page/";
        ThreadParser threadParser = new ThreadParser(URL, 5, 30);
        List<Film> call = threadParser.call();
        for (Film film : call) {
            System.out.println(film);
        }
    }
}
