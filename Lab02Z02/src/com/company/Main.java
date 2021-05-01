package com.company;

public class Main {

    public static void main(String[] args) {
	    class KontoBankowe {
	        int saldo;

	        int debet(int x) {
	            return saldo -= x;
            }

            int kredyt(int y) {
	            return saldo += y;
            }

            void pokazSaldo() {
                System.out.println("Saldo wynosi: " + saldo);
            }
        }

        KontoBankowe konto = new KontoBankowe();
	    konto.pokazSaldo();
	    konto.kredyt(1000);
	    konto.pokazSaldo();
	    konto.debet(620);
	    konto.pokazSaldo();
    }
}
