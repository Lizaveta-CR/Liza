package com.company.homework_16.task_5;

// +
public class CodeRefactor {
    public static void main(String[] args) {
        WebSite website = new WebSite("http://www.onliner.by");

        String url = website.getUrl();
        WebsiteType type = website.getType();

        System.out.println(url);
        System.out.println(type);
    }
}
