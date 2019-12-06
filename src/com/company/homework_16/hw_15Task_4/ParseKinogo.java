package com.company.homework_16.hw_15Task_4;

import com.company.homework_15.entity.Film;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ParseKinogo {
    // зачем тебе этот закомментированный код?
//    private static final String YEAR = "Год выпуска: ";
//    private static final String COUNTRY = " Страна: ";
//    private static final String TYPE = " Жанр: ";
//    private static final String QUALITY = " Качество: ";
//    private static final String CONTINUANCE = " Продолжительность: ";
//    private static final String DATE = " Премьера: ";

    public static void main(String[] args) throws IOException {
        Document doc = Jsoup.connect("https://kinogo.by")
                .userAgent("Safari")
                .get();


        List<String> link = getLink(doc);
        link.forEach(System.out::println);
        List<String> names = getFilmsName(doc);
        names.forEach(System.out::println);
    }

    private static List<String> getFilmsName(Document document) {
        List<String> filmsNames = new ArrayList<>();
        Elements filmTitles = document.select("h2");
        for (Element title : filmTitles) {
            filmsNames.add(title.text());
        }
        return filmsNames;
    }

    private static Film getYear(Element element) {//как мне лучше искать год?просто я не могу придумать хороший алгоритм
        Film film = new Film();
        //String year = movieElement.select("b:contains(Год выпуска:)").first().nextElementSibling().text();
        //   String year = element.select("b:contains(Год выпуска:)").toString();
        //  film.setYear(Integer.parseInt(year));
//        List<String> filmsName = getFilmsName(doc);
//        int year;
//        for (String s : filmsName) {
//            if (s.contains("[^0-9]")) {
//                filmYear.add()
//            }
//        }
//        Elements filmTitles = doc.select("Год выпуска:");
//        for (Element title : filmTitles) {
//            filmYear.add(title.text());
//        }
        return film;
    }

    private static List<String> getLink(Document doc) {
        List<String> Link = new ArrayList<>();
        Elements zagolovki = doc.select("h2.zagolovki");
        for (Element zagol : zagolovki) {
            Link.add(zagol.select("a").attr("href"));
        }
        return Link;
    }


    private static List<String> getDescription(Document doc) {//лушче так или передавать это в константы?Или ни то,ни то?
        List<String> strings = new ArrayList<>();
        Elements tags = doc.getElementsByTag("b");
        String[] stringTags = {"Год выпуска", "Страна", "Жанр", "Качество", "Перевод", "Продолжительность", "Премьера"}; // в статик поле
        for (Element paragraph : tags) {
            String tag = paragraph.text();
            // может проще stringTags сделать листом и вызвать метод contains()? делать будет тоже самое практически, но код лишний не надо писать
            for (int i = 0; i < stringTags.length; i++)
                if (tag.contains(stringTags[i])) {
                    strings.add(tag);
                }
        }
        return strings;
    }

}
