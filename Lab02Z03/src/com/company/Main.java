package com.company;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
	    class KoszykProduktow {
            private LinkedList produkty = new LinkedList();

            void dodajProduktDoKoszyka(String produkt) {
                produkty.add(produkt);
            }

            void pokazZamowienie() {
                System.out.println(produkty);
            }
        }

        KoszykProduktow koszyk = new KoszykProduktow();
	    koszyk.dodajProduktDoKoszyka("masło");
	    koszyk.dodajProduktDoKoszyka("jalapeno");
	    koszyk.dodajProduktDoKoszyka("mleko");
	    koszyk.pokazZamowienie();
    }
}
