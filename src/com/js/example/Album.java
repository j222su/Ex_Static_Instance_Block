package com.js.example;

public class Album {

    String singer = "";
    String title = "";
    String company = "";

    public Album() {
        singer = "MONSTA X";
        title = "LOVE KILLA";
        company = "Starship";
    }

    public Album(String singer, String title) {
        this.singer = singer;
        this.title = title;
        company = "Starship";
    }

    public String getSinger() {
        return singer;
    }

    public String getTitle() {
        return title;
    }

    public String getCompany() {
        return company;
    }
}
