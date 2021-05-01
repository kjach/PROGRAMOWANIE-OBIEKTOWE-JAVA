package com.company;

public class Main {

    public static void main(String[] args) {
    Przyklad p1 = new Przyklad();
    Przyklad p2 = new Przyklad(30);
    p1.wypisz();
    p2.wypisz();
    }
}
class Przyklad {
   private int wartosc;

    void wypisz() {
        System.out.println(wartosc);
    }
    Przyklad() {
        wartosc = 10;
    }
    Przyklad(int x) {
        wartosc = x;
    }
}