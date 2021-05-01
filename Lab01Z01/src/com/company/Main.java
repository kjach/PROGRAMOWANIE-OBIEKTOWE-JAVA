package com.company;

public class Main {

    public static void main(String[] args) {
	int liczba = 23;
	float fLiczba = 1.5f;
	double dLiczba = 1.5;

	boolean bCzy = true;

	String tekst = "No siema";
	String tekstInaczej = new String("Tekst inaczej");

        System.out.println("Tu mamy " + tekst + ", a tu mamy " + tekstInaczej);
        System.out.println(bCzy);

		System.out.println(args[0]);
		System.out.println(args[1]);
    }
}
