package com.company;

public class Main {

    public static void main(String[] args) {
	    Kalkulator kalkulatorPodstawowy = new Kalkulator();
        System.out.println(kalkulatorPodstawowy.dodaj(1, 2));
        System.out.println(kalkulatorPodstawowy.odejmij(4, 1));

        System.out.println();

        KalkulatorStatystyczny kalkulatorStatystyczny = new KalkulatorStatystyczny();
        System.out.println(kalkulatorStatystyczny.sinus(45));
        System.out.println(kalkulatorStatystyczny.dodaj(13, 22231));
        System.out.println(kalkulatorStatystyczny.odejmij(70, 1));

        System.out.println();

        Kalkulator kalkulatorStatystycznyNowy = new KalkulatorStatystyczny();
        System.out.println(kalkulatorStatystycznyNowy.dodaj(10, 21));
        System.out.println(kalkulatorStatystycznyNowy.odejmij(9,2));
        System.out.println(((KalkulatorStatystyczny)kalkulatorStatystycznyNowy).sinus(90));
    }
}

class Kalkulator {
    public int dodaj(int a, int b) {
        return a + b;
    }

    public int odejmij(int a, int b) {
        return a - b;
    }
}

class KalkulatorStatystyczny extends Kalkulator {
    public double sinus(int stopien) {
        double radian = stopien * 3.14159 / 180;
        return Math.sin(radian);
    }
}