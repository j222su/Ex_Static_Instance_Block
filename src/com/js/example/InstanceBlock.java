package com.js.example;

public class InstanceBlock {

    String singer = "";
    String title = "";
    String company = "";

    {
        System.out.println("인스턴스 블록");
        company = "Starship";
    }

    public InstanceBlock() {
        System.out.println("기본 생성자");
        singer = "MONSTA X";
        title = "LOVE KILLA";
    }

    public InstanceBlock(String singer, String title) {
        System.out.println("생성자");
        this.singer = singer;
        this.title = title;
    }
}
