package com.company;

public class Main {

    public static void main(String[] args) {
	    class Rower {
	        String wRuchu;
	        int predkosc;

	        String start() {
	           return wRuchu = "Tak";
            }

            String stop() {
                return wRuchu = "Nie";
            }

            int przyspiesz(int x) {
	            return predkosc += x;
            }

            void wyswietlStan() {
                System.out.println("Obecny stan");
                System.out.println("Prędkość wynosi: " + predkosc);
                System.out.println("Czy rower jest w ruchu? " + wRuchu);

            }
        }

        Rower rower1 = new Rower();
	    rower1.predkosc = 20;
	    rower1.start();
	    rower1.wyswietlStan();
	    rower1.przyspiesz(10);
	    rower1.wyswietlStan();

	    Rower rower2 = new Rower();
	    rower2.predkosc = 0;
	    rower2.stop();
	    rower2.wyswietlStan();
    }
}
