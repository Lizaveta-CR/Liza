package com.company.homework_15.task_4;

import com.company.homework_15.entity.Film;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ParseKinogo {

    public static void main(String[] args) throws IOException {
        Document doc = Jsoup.connect("https://kinogo.by")
                .userAgent("Safari")
                .get();

        Elements tags = doc.getElementsByTag("b");
        List<Film> films = new ArrayList<>();
        //    List<String> tagList = new ArrayList<>();
        Elements information = doc.getElementsByTag("br");//тут я просто не понимаю,что надо написать в
        // этот "tagName",ибо в html коде по-разному(<a>,<br>...)
//        List<String> infList = new ArrayList<>();
//        List<String> total = new ArrayList<>();
        String[] stringTags = {"Год выпуска", "Страна", "Жанр", "Качество", "Перевод", "Продолжительность", "Премьера"};
        for (Element paragraph : tags) {
            String tag = paragraph.text();
            for (int i = 0; i < stringTags.length; i++)
                if (tag.contains(stringTags[i])) {
                    System.out.println(tag);
                }
        }
        for (Element element : information) {//в этом цикле я не понимаю,какой тэг использовать
            String info = element.text();
            System.out.println(info);
            //  }
            //  }

        }
    }
}
