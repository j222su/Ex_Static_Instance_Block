package com.js.example;

public class Album {

    String singer = "";
    String title = "";
    String company = "";

    public Album() {
        System.out.println("기본 생성자");
        singer = "MONSTA X";
        title = "LOVE KILLA";
        company = "Starship";
    }

    public Album(String singer, String title) {
        System.out.println("생성자");
        this.singer = singer;
        this.title = title;
        company = "Starship";
    }
}
