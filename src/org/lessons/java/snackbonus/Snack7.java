package org.lessons.java.snackbonus;

import java.util.Scanner;

public class Snack7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Scrivi un numero di secondi: ");
        int number = sc.nextInt();

        //calcolo di ore, minuti e secondi
        int hours = number / 3600;

        int minutes = (number % 3600) / 60;

        int seconds = number % 60;

        // Stampa il risultato inserendo i risultati ottenuti.
        System.out.printf("\nTempo ottenuto: %02d:%02d:%02d", hours, minutes, seconds);

        sc.close();
    }
}

