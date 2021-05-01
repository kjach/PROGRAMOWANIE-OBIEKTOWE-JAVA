package com.company;

public class Main {

    public static void main(String[] args) {
        Kwadrat kwadrat = new Kwadrat(4);
        System.out.println("Obwód kwadratu: " + kwadrat.obliczObwod());
        System.out.println("Pole kwadratu: " + kwadrat.obliczPowierzchnie());
        System.out.println();
        Kolo kolo = new Kolo(6);
        System.out.println("Obwód koła: " + kolo.obliczObwod());
        System.out.println("Pole koła: " + kolo.obliczPowierzchnie());
    }
}

interface Ksztalt {
    public double obliczPowierzchnie();
    public double obliczObwod();
}

class Kwadrat implements Ksztalt {
    double dlugoscBoku;

    public Kwadrat(double dlugoscBoku) {
        this.dlugoscBoku = dlugoscBoku;
    }

    @Override
    public double obliczObwod() {
        return dlugoscBoku * 4;
    }

    @Override
    public double obliczPowierzchnie() {
        return dlugoscBoku * dlugoscBoku;
    }
}

class Kolo implements Ksztalt {
    double promien;

    public Kolo(double promien) {
        this.promien = promien;
    }

    @Override
    public double obliczPowierzchnie() {
        return Math.PI * promien * promien;
    }

    @Override
    public double obliczObwod() {
        return 2 * Math.PI * promien;
    }


}