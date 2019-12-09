package com.company.homework_16.hw_15Task_4;

import java.util.Date;

// +
public class Film {
    private int year;
    private String country;
    private String type;
    private String quality;
    private String continuance;
    private Date date;

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

    public String getContinuance() {
        return continuance;
    }

    public void setContinuance(String continuance) {
        this.continuance = continuance;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Film{" +
                "year=" + year +
                ", country='" + country + '\'' +
                ", type='" + type + '\'' +
                ", quality='" + quality + '\'' +
                ", continuance='" + continuance + '\'' +
                ", date=" + date +
                '}';
    }
}
