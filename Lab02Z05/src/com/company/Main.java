package com.company;

public class Main {

    public static void main(String[] args) {
	    Punkt punkt1 = new Punkt();
	    punkt1.x = 1;
	    punkt1.y = 2;

	    Punkt punkt2 = new Punkt();
	    punkt2.x = 3;
	    punkt2.y = 4;

	    Linia linia1 = new Linia();
	    linia1.poczatek = punkt1;
	    linia1.koniec = punkt2;

        System.out.println(linia1.koniec.x);
        System.out.println(linia1.poczatek.y);
    }
}

class Punkt {
    public int x;
    public int y;
}

class Linia {
    public Punkt poczatek;
    public Punkt koniec;
}