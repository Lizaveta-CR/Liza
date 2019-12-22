package com.company.homework_16.hw_15Task_4;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ParseKinogo {

    public static void main(String[] args) throws IOException {
        String URL = "https://kinogo.by/page/";
//аналогичная ошибка
        int numberOfPagesToParse = 5;
        for (int i = 4; i <= numberOfPagesToParse; i++) {
            String newURL = URL.concat(String.valueOf(i));
            Document doc = Jsoup.connect(newURL)
                    .userAgent("Safari")
                    .get();
            Elements content = getFilmContent(doc);
            for (Element element : content) {
                System.out.println(getFilm(element));
            }
        }
    }

    private static Elements getFilmContent(Document document) {
        Elements shortimg = document.getElementsByClass("shortimg");
        return shortimg;
    }

    private static Film getFilm(Element type) {
        Film film = new Film();
        String filmName = getFilmName(type);
        String year = getYear(type);
        List<String> country = getCountry(type);
        List<String> filmType = getType(type);
        String quality = getQuality(type);
        String translation = getTranslation(type);
        String continuance = getContinuance(type);
        String date = getDate(type);
        String link = getLink(type);
        String description = getDescription(type);
        film.setName(filmName);
        film.setYear(year);
        film.setCountry(country);
        film.setType(filmType);
        film.setQuality(quality);
        film.setTranslation(translation);
        film.setContinuance(continuance);
        film.setDate(date);
        film.setLink(link);
        film.setDescription(description);
        return film;
    }

    private static String getFilmName(Element filmName) {
        String stringRegexNumber = "\\([^()]*\\)";
        Elements ariaLabel = filmName.getElementsByAttribute("aria-label");
        String filmTitle = ariaLabel.attr("aria-label");
        if (!filmTitle.isEmpty()) {
            String[] strings = filmTitle.split(" ");
            for (String splittedString : strings) {
                if (splittedString.matches(stringRegexNumber)) {
                    int titleNumberLength = splittedString.length();
                    if (titleNumberLength >= 4 & titleNumberLength <= 6) {
                        filmTitle = filmTitle.replace(splittedString, "");
                    }
                }
            }
        }
        return filmTitle;
    }

    private static String getYear(Element type) {
        Elements year = type.select("b:contains(Год выпуска:)");
        String yearText = year.next().text();
        if (yearText.isEmpty()) {
            return "No information";
        }
        return yearText;
    }

    private static List<String> getCountry(Element type) {
        List<String> countryList = new ArrayList<>();
        Element country = type.select("b:contains(Страна:)").first();
        if (!country.text().isEmpty()) {
            Node currentElement = country.nextSibling();
            do {
                if (!currentElement.toString().isEmpty()) {
                    countryList.add(currentElement.toString().trim());
                }
                currentElement = currentElement.nextSibling();
            }
            while (!currentElement.toString().equals("<br>"));
        } else {
            countryList.add("No information");
        }
        return countryList;
    }

    private static List<String> getType(Element type) {
        List<String> typeList = new ArrayList<>();
        Element types = type.select("b:contains(Жанр:)").first();

        if (!types.text().isEmpty()) {
            Element currentElement = types.nextElementSibling();
            do {
                if (!currentElement.text().isEmpty()) {
                    typeList.add(currentElement.text());
                }
                currentElement = currentElement.nextElementSibling();
            }
            while (!currentElement.text().equals("Качество:"));
        } else {
            typeList.add("No information");
        }
        return typeList;
    }

    private static String getQuality(Element type) {
        Element quality = type.select("b:contains(Качество:)").first();
        Node nodeNextElement = quality.nextSibling();
        if (nodeNextElement.toString().isEmpty()) {
            return "No information";
        }
        return nodeNextElement.toString().trim();
    }

    private static String getTranslation(Element type) {
        Element translation = type.select("b:contains(Перевод:)").first();
        Node nodeNextElement = translation.nextSibling();
        if (nodeNextElement.toString().isEmpty()) {
            return "No information";
        }
        return nodeNextElement.toString().trim();
    }

    private static String getContinuance(Element type) {
        Element continuance = type.select("b:contains(Продолжительность:)").first();
        Node nodeNextElement = continuance.nextSibling();
        if (nodeNextElement.toString().isEmpty()) {
            return "No information";
        }
        return nodeNextElement.toString().trim();
    }

    private static String getDate(Element type) {
        Element continuance = type.select("b:contains(Премьера:)").first();
        if (!continuance.text().isEmpty()) {
            Node nodeNextElement = continuance.nextSibling();
            return nodeNextElement.toString().trim();
        } else {
            return "No information";
        }
    }

    private static String getDescription(Element type) {
        Element descriptions = type.select(".shortimg").first();
        String replacedDescr = descriptions.text().replace("Лицензия", "").trim();
        if (descriptions.text().isEmpty()) {
            return "No information";
        }
        return replacedDescr;
    }

    private static String getLink(Element type) {
        Elements ariaLabel = type.getElementsByAttribute("aria-label");
        String link = ariaLabel.attr("href");
        if (link.isEmpty()) {
            return "No information";
        }
        return link;
    }

//    private static List<Film> getListOfFilms
//            (List<String> links, List<String> filmesNames, List<String> descriptions, List<String> years,
//             List<List<String>> countries, List<List<String>> types, List<String> qualities, List<String> translations,
//             List<String> continuances, List<String> dates) {
//        int numberOfFilms = filmesNames.size();
//        List<Film> filmList = new ArrayList<>();
//        for (int i = 0; i < numberOfFilms; i++) {
//            Film film = new Film();
//            film.setLink(links.get(i));
//            film.setName(filmesNames.get(i));
//            film.setDescription(descriptions.get(i));
//            film.setYear(Integer.parseInt(years.get(i)));
//            film.setCountry(countries.get(i));
//            film.setType(types.get(i));
//            film.setQuality(qualities.get(i));
//            film.setTranslation(translations.get(i));
//            film.setContinuance(continuances.get(i));
//            film.setDate(dates.get(i));
//            filmList.add(film);
//        }
//        return filmList;
}


