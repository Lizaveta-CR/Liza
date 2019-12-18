package com.company.homework_16.hw_15Task_4;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ParseKinogo {

    public static void main(String[] args) throws IOException {
        Document doc = Jsoup.connect("https://kinogo.by")
                .userAgent("Safari")
                .get();

        System.out.println("Links");
        List<String> link = getLink(doc);
        link.forEach(System.out::println);
        System.out.println("Film");
        List<String> names = getFilmsName(doc);
        names.forEach(System.out::println);
        System.out.println("Year");
        List<String> year = getYear(doc);
        year.forEach(System.out::println);
        System.out.println("Country");
        List<List<String>> country = getCountry(doc);
        country.forEach(System.out::println);
        System.out.println("Type");
        List<List<String>> type = getType(doc);
        type.forEach(System.out::println);
        System.out.println("Quality");
        List<String> quality = getQuality(doc);
        quality.forEach(System.out::println);
        System.out.println("Continuance");
        List<String> continuance = getContinuance(doc);
        continuance.forEach(System.out::println);
        System.out.println("translation");
        List<String> translation = getTranslation(doc);
        translation.forEach(System.out::println);
        System.out.println("date");
        List<String> date = getDate(doc);
        date.forEach(System.out::println);
        System.out.println("Description");
        List<String> description = getDescription(doc);
        description.forEach(System.out::println);
    }

    private static List<String> getFilmsName(Document document) {
        String stringRegexNumber = "\\([^()]*\\)";
        List<String> filmsNames = new ArrayList<>();
        Elements filmTitles = document.select("h2");
        for (Element title : filmTitles) {
            String[] strings = title.text().split(" ");
            for (String splittedString : strings) {
                if (splittedString.matches(stringRegexNumber)) {
                    int titleNumberLength = splittedString.length();
                    if (titleNumberLength >= 4 & titleNumberLength <= 6) {
                        String replace = title.text().replace(splittedString, "");
                        filmsNames.add(replace);
                    } else {
                        filmsNames.add(title.text());
                    }
                }
            }
        }
        return filmsNames;
    }

    private static List<String> getYear(Document document) {
        List<String> yearsList = new ArrayList<>();
        Elements years = document.select("b:contains(Год выпуска:)");
        for (Element year : years) {
            yearsList.add(year.nextElementSibling().text());
        }
        return yearsList;
    }

    private static List<List<String>> getCountry(Document document) {
        List<List<String>> countryList = new ArrayList<>();
        Elements countries = document.select("b:contains(Страна:)");
        for (Element country : countries) {
            Node currentElement = country.nextSibling();
            List<String> typeListForOneCountry = new ArrayList<>();
            do {
                if (!currentElement.toString().isEmpty()) {
                    typeListForOneCountry.add(currentElement.toString().trim());
                }
                currentElement = currentElement.nextSibling();
            }
            while (!currentElement.toString().equals("<br>"));
            countryList.add(typeListForOneCountry);
        }
        return countryList;
    }

    private static List<List<String>> getType(Document document) {
        List<List<String>> totalList = new ArrayList<>();
        Elements types = document.select("b:contains(Жанр:)");
        for (Element type : types) {
            Element currentElement = type.nextElementSibling();
            List<String> typeListForOneFilm = new ArrayList<>();
            do {
                if (!currentElement.text().isEmpty()) {
                    typeListForOneFilm.add(currentElement.text());
                }
                currentElement = currentElement.nextElementSibling();
            }
            while (!currentElement.text().equals("Качество:"));
            totalList.add(typeListForOneFilm);
        }
        return totalList;
    }

    private static List<String> getQuality(Document document) {
        List<String> qualityList = new ArrayList<>();
        Elements qualities = document.select("b:contains(Качество:)");
        for (Element quality : qualities) {
            qualityList.add(quality.nextSibling().toString());
        }
        return qualityList;
    }

    private static List<String> getTranslation(Document document) {
        List<String> translationList = new ArrayList<>();
        Elements translations = document.select("b:contains(Перевод:)");
        for (Element translation : translations) {
            translationList.add(translation.nextSibling().toString());
        }
        return translationList;
    }

    private static List<String> getContinuance(Document document) {
        List<String> continuanceList = new ArrayList<>();
        Elements selectConts = document.select("b:contains(Продолжительность:)");
        for (Element selectCont : selectConts) {
            continuanceList.add(selectCont.nextSibling().toString());
        }
        return continuanceList;
    }

    private static List<String> getDate(Document document) {
        List<String> dateList = new ArrayList<>();
        Elements dates = document.select("b:contains(Премьера:)");
        for (Element date : dates) {
            dateList.add(date.nextSibling().toString());
        }
        return dateList;
    }

    private static List<String> getDescription(Document doc) {
        List<String> descrList = new ArrayList<>();
        Elements descriptions = doc.select(".shortimg");
        for (Element descrip : descriptions) {
            descrList.add(descrip.select("div").text().replace("Лицензия", "").trim());
        }
        return descrList;
    }

    private static List<String> getLink(Document doc) {
        List<String> linkList = new ArrayList<>();
        Elements zagolovki = doc.select("h2.zagolovki");
        for (Element zagol : zagolovki) {
            linkList.add(zagol.select("a").attr("href"));
        }
        return linkList;
    }
}
