package com.company;

public class Main {

    public static void main(String[] args) {
	    MojKalkulator mojKalkulator = new MojKalkulator();
        System.out.println(mojKalkulator.dodaj(3,4));
        System.out.println(mojKalkulator.odejmij(4,2));
        System.out.println(mojKalkulator.sinus(90));

        System.out.println();

        Kalkulator nowyKalkulator = new MojKalkulator();
        System.out.println(nowyKalkulator.dodaj(10,2));
        System.out.println(nowyKalkulator.odejmij(9,3));
    }
}

interface Kalkulator {
    double PI = 3.14159;

    public double dodaj(double a, double b);
    public double odejmij(double a, double b);
}

class MojKalkulator implements Kalkulator {

    @Override
    public double dodaj(double a, double b) {
        return a + b;
    }

    @Override
    public double odejmij(double a, double b) {
        return a - b;
    }

    public double sinus(double stopien) {
        double radian = stopien * PI/180;
        return Math.sin(radian);
    }
}