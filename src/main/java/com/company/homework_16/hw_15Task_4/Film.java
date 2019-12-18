package com.company.homework_16.hw_15Task_4;

import java.util.Arrays;
import java.util.Date;

public class Film {
    private String link;
    private String name;
    private String description;
    private int year;
    private String country;
    private String type;
    private String quality;
    private String translation;
    private String continuance;
    private String date;

    private String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public String getTranslation() {
        return translation;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }

    public String getContinuance() {
        return continuance;
    }

    public void setContinuance(String continuance) {
        this.continuance = continuance;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Film{" +
                "link='" + link + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                ", type='" + type + '\'' +
                ", quality='" + quality + '\'' +
                ", translation='" + translation + '\'' +
                ", continuance='" + continuance + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
