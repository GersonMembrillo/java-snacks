package org.lessons.java.snack;

import java.util.Scanner;

public class Snack5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("CHECK WORD!");

        int lettere, numeri, simboli;
        String word;

        System.out.print("\nScrivi una parola: ");
        word = sc.nextLine();

        while (!word.equals("0") && !word.contains("0")) { //finche non verrà usato lo 0 chiederà nuova parola
            // Inizializza i conteggi per ogni nuova parola
            lettere = 0;
            numeri = 0;
            simboli = 0;

            // Questo for controlla ogni carattere della parola
            for (char carattere : word.toCharArray()) {
                if (Character.isLetter(carattere)) {
                    lettere++;
                } else if (Character.isDigit(carattere)) {
                    numeri++;
                } else {
                    simboli++;
                }
            }

            System.out.println("Numero di lettere: " + lettere);
            System.out.println("Numero di numeri: " + numeri);
            System.out.println("Numero di simboli non alfabetici: " + simboli);

            System.out.print("\nScrivi una parola (oppure inserisci 0 per uscire): ");
            word = sc.nextLine();
        }

        sc.close();
    }
}


