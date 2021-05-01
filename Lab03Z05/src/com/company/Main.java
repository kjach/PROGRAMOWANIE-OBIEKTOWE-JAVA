package com.company;

public class Main {

    public static void main(String[] args) {
        Operacje o = new Operacje(7, 5);
        Operacje o2 = new Operacje(12);

        System.out.println(o.wykonajOperacjeMatematycznaMnozenie(1,1));
    }
}
class Operacje {

    int a, b;

    public Operacje() {
    }

    public Operacje (int a) {
        this.a = a;
    }

    public Operacje (int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int wykonajOperacjeMatematycznaDodawanie() {
        return a + b;
    }

    public int wykonajOperacjeMatematycznaDodawanie(int a) {
        return a + b;
    }

    public int wykonajOperacjeMatematycznaMnozenie(int a, int b) {
        return a * b;
    }
}