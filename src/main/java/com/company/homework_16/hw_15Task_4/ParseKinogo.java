package com.company.homework_16.hw_15Task_4;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;
import org.w3c.dom.events.Event;
import org.w3c.dom.events.EventTarget;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ParseKinogo {

    public static List<Film> parseFilms(Document document) {
        List<Film> films = new ArrayList<>();
        Elements content = getFilmContent(document);
        for (Element element : content) {
            films.add(getFilm(element));
        }
        return films;
    }

    private static Elements getFilmContent(Document document) {
        return document.getElementsByClass("shortimg");
    }

    private static Film getFilm(Element type) {
        Film film = new Film();
        film.setName(getFilmName(type));
        film.setYear(getYear(type));
        film.setCountry(getCountry(type));
        film.setType(getType(type));
        film.setQuality(getQuality(type));
        film.setTranslation(getTranslation(type));
        film.setContinuance(getContinuance(type));
        film.setDate(getDate(type));
        film.setLink(getLink(type));
        film.setDescription(getDescription(type));
        return film;
    }

    private static String getFilmName(Element filmName) {
        String stringRegexNumber = "\\([^()]*\\)";
        Elements ariaLabel = filmName.getElementsByAttribute("aria-label");
        String filmTitle = ariaLabel.attr("aria-label");
        if (filmTitle != null && !filmTitle.isEmpty()) {
            String[] strings = filmTitle.split(" ");
            for (String splittedString : strings) {
                if (splittedString.matches(stringRegexNumber)) {
                    int titleNumberLength = splittedString.length();
                    if (titleNumberLength >= 4 & titleNumberLength <= 6) {
                        filmTitle = filmTitle.replace(splittedString, "");
                    }
                }
            }
            return filmTitle.trim();
        } else {
            return "No information";
        }
    }

    private static String getYear(Element type) {
        Elements year = type.select("b:contains(Год выпуска:)");
        String yearText = year.next().text();
        if (yearText != null && !yearText.isEmpty()) {
            return yearText;
        } else {
            return "No information";
        }
    }

//    private static Node getEventClass(Node element) {
//        if (element instanceof Element) {
//            return ((Element) element).nextElementSibling();
//        }
//        return element.nextSibling();
//    }

//    private static List<String> getValueList(Element type, String pattern) {
//        List<String> totalList = new ArrayList<>();
//        Element element = type.select(pattern).first();
//        if (element != null && !element.text().isEmpty()) {
//            Node currentElement = getEventClass(element);
//            do {
//                if (!currentElement.toString().isEmpty()) {
//                    totalList.add(currentElement.toString().trim());
//                }
//                getEventClass(element);
//            }
//            while (!currentElement.toString().equals("<br>"));//??
//        } else {
//            totalList.add("No information");
//        }
//        return getValueList(...);
//    }

    private static List<String> getCountry(Element type) {
        List<String> countryList = new ArrayList<>();
        Element country = type.select("b:contains(Страна:)").first();
        if (country != null && !country.text().isEmpty()) {
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

        if (types != null && !types.text().isEmpty()) {
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
        if (quality != null && !quality.text().isEmpty()) {
            Node nodeNextElement = quality.nextSibling();
            return nodeNextElement.toString().trim();
        } else {
            return "No information";
        }
    }

    private static String getTranslation(Element type) {
        Element translation = type.select("b:contains(Перевод:)").first();

        if (translation != null && !translation.toString().isEmpty()) {
            Node nodeNextElement = translation.nextSibling();
            return nodeNextElement.toString().trim();
        } else {
            return "No information";
        }
    }

    private static String getValue(Element type, String pattern) {
        Element element = type.select(pattern).first();
        if (element != null && !element.toString().isEmpty()) {
            Node nodeNextElement = element.nextSibling();
            return nodeNextElement.toString().trim();
        } else {
            return "No information";
        }
    }

    private static String getContinuance(Element type) {
        return getValue(type, "b:contains(Продолжительность:)");
    }

    private static String getDate(Element type) {
        return getValue(type, "b:contains(Премьера:)");
    }

    private static String getDescription(Element type) {
        Element descriptions = type.select(".shortimg").first();
        String replacedDescr = descriptions.text().replace("Лицензия", "").trim();
        if (descriptions != null && !descriptions.text().isEmpty()) {
            return replacedDescr;
        } else {
            return "No information";
        }
    }

    private static String getLink(Element type) {
        Elements ariaLabel = type.getElementsByAttribute("aria-label");
        String link = ariaLabel.attr("href");
        if (link != null && !link.isEmpty()) {
            return link;
        } else {
            return "No information";
        }
    }
}


