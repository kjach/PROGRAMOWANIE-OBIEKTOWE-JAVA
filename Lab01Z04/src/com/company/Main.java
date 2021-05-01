package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner wejscie = new Scanner(System.in);

        System.out.println("Podaj liczbę wierszy: ");
        int wiersz = wejscie.nextInt();

        System.out.println("Podaj liczbę kolumn: ");
        int kolumna = wejscie.nextInt();

        System.out.println("\n==========================================\n");

        for (int i = 1; i <= wiersz; i++) {
            for (int j = 1; j <= kolumna; j++) {
                System.out.print(i*j + "\t");
            }
            System.out.println();
        }
    }
}

