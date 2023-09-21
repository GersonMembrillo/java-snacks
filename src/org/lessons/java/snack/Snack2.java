package org.lessons.java.snack;

import java.util.Random;

import java.util.Scanner;

public class Snack2 {
	
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);

        System.out.print("Vuoi vedere la magnifica lista nome del Grande Gatsby?: ");
        String answer = sc.nextLine();

        String[] name = {
            "Pinco",
            "Ciccio",
            "Miss K.",
            "Testi",
            "Gaida",
            "Mutan",
            "Homer",
            "Cocco Lhamy",
        };

        String[] lastName = {
            "Pallino",
            "Pasticcio",
            "L'Ur Ina.",
            "Colì",
            "Mare",
            "Dyna",
            "Sexuale",
            "N' Pò",
        };

//      equalsIgnoreCase indica valida solo la risposta indicata, le altre le considera else
        if ("si".equalsIgnoreCase(answer)) {
            Random random = new Random();

            for (int i = 0; i < 20; i++) {
                String randomName = name[random.nextInt(name.length)];
                String randomLastName = lastName[random.nextInt(lastName.length)];
                String fullName = randomName + " " + randomLastName;
                System.out.println("\n" + fullName + "\n\n*-*-*-*-*-*-*-*");
            }
        } else {
            System.out.println("\nALLORA CHE CI FAI QUI? SICUREZZA!!!");
        }

        sc.close();
    }
}