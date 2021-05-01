package com.company;

public class Main {

    public static void main(String[] args) {
	    String wszystkie = "";
        String wszystkie1 = "";

        for (int i = 0; i < args.length; i++) {
            wszystkie += args[i] + ", ";

        }
        System.out.println(wszystkie);

        for (String wypisz : args) {
            wszystkie1 += wypisz + ", ";

        }
        System.out.println(wszystkie1);
    }
}
