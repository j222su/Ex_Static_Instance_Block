package com.js.example;

public class Main {

    public static void main(String[] args) {
	    Album album1 = new Album();
	    Album album2 = new Album("MONSTA X", "GAMBLER");

        InstanceBlock instanceBlock1 = new InstanceBlock();
        InstanceBlock instanceBlock2 = new InstanceBlock("MONSTA X", "GAMBLER");

        StaticBlock staticBlock1 = new StaticBlock("생성자1");
        StaticBlock staticBlock2 = new StaticBlock("생성자2");
    }
}
