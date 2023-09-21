package org.lessons.java.snackbonus;

import java.util.Scanner;

public class Snack9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int somma = 0;
        int numero;

        while (somma < 1000) {
            System.out.print("Scrivi un numero: ");
            numero = sc.nextInt();
            somma += numero;
            System.out.println("\nSomma parziale: " + somma);
        }

        System.out.println("La somma totale è: " + somma);
        sc.close();
    }
}

