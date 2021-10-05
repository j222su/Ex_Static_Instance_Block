package com.js.example;

public class InstanceBlock {

    String singer = "";
    String title = "";
    String company = "";

    {
        System.out.println("Instance Block");
        company = "Starship";
    }

    public InstanceBlock() {
        System.out.println("InstanceBlock 기본 생성자");
        singer = "MONSTA X";
        title = "LOVE KILLA";
    }

    public InstanceBlock(String singer, String title) {
        System.out.println("InstanceBlock 생성자");
        this.singer = singer;
        this.title = title;
    }
}
