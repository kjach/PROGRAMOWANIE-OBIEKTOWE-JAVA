package com.company;

public class Main {

    public static void main(String[] args) {
        String imie = "Kacper";
        String nazwisko = "Jach";
        if ((args.length == 2) && (args[0].equals(imie))&& (args[1].equals(nazwisko))) {
            System.out.println("Tu siedzi właściciel");
        } else if (args.length == 2) {
            System.out.println("Przy tym komputerze siedzi " + args[0] + " " +args[1]);
        } else {
            System.out.println("Trzeba podać dokładnie 2 argumenty!");
        }

    }
}
