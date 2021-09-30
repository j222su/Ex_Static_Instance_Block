package com.js.example;

public class Main {

    public static void main(String[] args) {
	    Album album1 = new Album();
	    Album album2 = new Album("MONSTA X", "GAMBLER");

        System.out.printf("가수 : %s / 제목 : %s / 회사 : %s \n", album1.getSinger(), album1.getTitle(), album1.getCompany());
        System.out.printf("가수 : %s / 제목 : %s / 회사 : %s", album2.getSinger(), album2.getTitle(), album2.getCompany());
    }
}
