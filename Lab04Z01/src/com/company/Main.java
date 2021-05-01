package com.company;

public class Main {

    public static void main(String[] args) {
	    Podstawowa podstawa = new Podstawowa();
	    podstawa.wypiszTekstF();
	    podstawa.wypiszTekstG();

        System.out.println();

	    Pochodna pochodna1 = new Pochodna();
	    pochodna1.wypiszTekstF();
	    pochodna1.wypiszTekstG();
	    pochodna1.wypiszTekstH();

        System.out.println();

	    Podstawowa pochodna2 = new Pochodna();
        pochodna2.wypiszTekstF();
	    pochodna2.wypiszTekstG();
    }
}
class Podstawowa {
    public void wypiszTekstF() {
        System.out.println("f() w Podstawowa");
    }

    public void wypiszTekstG() {
        System.out.println("g() w Podstawowa");
    }
}

class Pochodna extends Podstawowa {
    public void wypiszTekstG() {
        System.out.println("g() w Pochodna");
    }
    public void wypiszTekstH() {
        System.out.println("h() w Pochodna");
    }
}