package com.company.zadanie1;

public class Main {

    public static void main(String[] args) {
        Kwadrat kwadrat = new Kwadrat(5);
        Trojkat trojkat = new Trojkat(5, 4, 2);

        System.out.println("Powierzchnia kształtu to: " + kwadrat.obliczPowierzchnie());
        System.out.println("Powierzchnia kształtu to: " + trojkat.obliczPowierzchnie());
    }
}
