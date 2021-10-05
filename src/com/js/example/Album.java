package com.js.example;

public class Album {

    String singer = "";
    String title = "";
    String company = "";

    public Album() {
        System.out.println("Album 기본 생성자");
        singer = "MONSTA X";
        title = "LOVE KILLA";
        company = "Starship";
    }

    public Album(String singer, String title) {
        System.out.println("Album 생성자");
        this.singer = singer;
        this.title = title;
        company = "Starship";
    }
}
