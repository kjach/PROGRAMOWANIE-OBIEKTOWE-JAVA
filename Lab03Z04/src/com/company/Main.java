package com.company;

public class Main {

    public static void main(String[] args) {
        PrzykladPrzeciazanie p = new PrzykladPrzeciazanie();
        p.wypisz(10);
        p.wypisz(19.2);
        p.wypisz("Ala");
    }
}

class PrzykladPrzeciazanie {
    public void wypisz(int x) {
        System.out.println("int: " + x);
    }
    public void wypisz(double x) {
        System.out.println("double: " + x);
    }
    public void wypisz(String x) {
        System.out.println("String: " + x);
    }
}