package com.company;

public class Main {

    public static void main(String[] args) {
	    Punkt p1 = new Punkt(10, 20);
        System.out.println(p1);

        Linia l1 = new Linia(1,2,3,4);
        //System.out.println(l1.getPoczatek());
        System.out.println(l1);

        Punkt p2 = new Punkt(21,40);
        Punkt p3 = new Punkt(7,13);

        Linia l2 = new Linia(p2, p3);
        System.out.println(l2.getPoczatek());
        System.out.println(l2.getKoniec());
    }
}

class Punkt {
    private int x;
    private int y;

    public Punkt (int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Punkt{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Linia {
    private Punkt poczatek;
    private Punkt koniec;

    public Linia(Punkt poczatek, Punkt koniec) {
        this.poczatek = poczatek;
        this.koniec = koniec;
    }

    public Linia(int poczatekX, int poczatekY, int koniecX, int koniecY) {
        this.poczatek = new Punkt(poczatekX, poczatekY);
        this.koniec = new Punkt(koniecX, koniecY);
    }

    public Punkt getPoczatek() {
        return poczatek;
    }

    public Punkt getKoniec() {
        return koniec;
    }

    @Override
    public String toString() {
        return "Linia{" +
                "poczatek=" + poczatek +
                ", koniec=" + koniec +
                '}';
    }
}
