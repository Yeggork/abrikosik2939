package com.example.abrikosik2939;

public class Writer {
    private String FIO;
    private String birtDay;
    private String deathDay;
    private String shortDescription;
    private String description;
    private int picture;

    public Writer(String FIO, String birtDay, String deathDay, String shortDescription, int picture, String description) {
        this.FIO = FIO;
        this.birtDay = birtDay;
        this.deathDay = deathDay;
        this.shortDescription = shortDescription;
        this.picture = picture;
        this.description = description;
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public String getBirtDay() {
        return birtDay;
    }

    public void setBirtDay(String birtDay) {
        this.birtDay = birtDay;
    }

    public String getDeathDay() {
        return deathDay;
    }

    public void setDeathDay(String deathDay) {
        this.deathDay = deathDay;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPicture() {
        return picture;
    }

    public void setPicture(int picture) {
        this.picture = picture;
    }
}
