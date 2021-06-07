package com.company.zadanie1;

public class Trojkat implements Ksztalt{
    double bok1;
    double bok2;
    double bok3;

    public Trojkat(double bok1, double bok2, double bok3) {
        this.bok1 = bok1;
        this.bok2 = bok2;
        this.bok3 = bok3;
    }

    @Override
    public double obliczPowierzchnie() {
        double p = obliczObwod() / 2;
        return Math.sqrt(p*(p-bok1)*(p-bok2)*(p-bok3));
    }

    @Override
    public double obliczObwod() {
        return bok1 + bok2 + bok3;
    }
}
