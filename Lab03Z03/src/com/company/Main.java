package com.company;

public class Main {

    public static void main(String[] args) {
	    Przyklad p1 = new Przyklad();
	    p1.wypisz();
        Przyklad p2 = new Przyklad(10);
        p2.wypisz();
        Przyklad p3 = new Przyklad(50,13);
        p3.wypisz();
    }
}

class Przyklad{
    private double polePierwsze;
    private double poleDrugie;

    public void wypisz() {
        System.out.println(polePierwsze + "," + poleDrugie);
    }

    public Przyklad() {
        this.polePierwsze = 0;
        this.poleDrugie = 0;
    }

    public Przyklad(double polePierwsze) {
        this.polePierwsze = polePierwsze;
        this.poleDrugie = 0;
    }

    public Przyklad(double polePierwsze, double poleDrugie) {
        this.polePierwsze = polePierwsze;
        this.poleDrugie = poleDrugie;
    }
}