package com.company.projectKinogo;

import java.util.List;

public class MainKinogo {
    public static void main(String[] args) throws Exception {
        String URL = "https://kinogo.by/page/";
        ThreadParser threadParser = new ThreadParser(URL, 5, 30);
        List<Film> filmList = threadParser.call();
        for (Film film : filmList) {
            System.out.println(film);
        }
    }
}
