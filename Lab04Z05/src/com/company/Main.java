package com.company;

public class Main {

    public static void main(String[] args) {
	    Samochod samochod1 = new Samochod();
        System.out.println("Nazwa silnika to: " + samochod1.getSeriaSilnika());
    }
}

class Silnik {
    int seria;

    public int getSeria() {
        return seria;
    }

    public void setSeria(int seria) {
        this.seria = seria;
    }
}

class Samochod {
    private Silnik silnik;


    public Samochod() {
        this.silnik = new Silnik();
        silnik.setSeria(1234);
    }

    public int getSeriaSilnika() {
        return silnik.getSeria();
    }
}

