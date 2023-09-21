package org.lessons.java.snack;

import java.util.Random;

import java.util.Scanner;

public class Snack3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Vuoi iniziare a creare una lista di numeri?: ");
        String answer = sc.nextLine();
        sc.close();

        if (!"si".equalsIgnoreCase(answer)) {
            System.out.println("Nessuna lista di numeri creata.");
        } else {
            Random random = new Random();
            // qui random.ints(il primo numero è quantità, gli altri due min e max)
            int[] numeriCasuali = random.ints(10, 0, 100).toArray();

            System.out.print("Numeri casuali generati: ");
            int sommaDispari = 0;

            for (int i = 0; i < numeriCasuali.length; i++) {
                int numero = numeriCasuali[i];
                System.out.print(numero + " ");
                if (i % 2 == 0) { // Controlla numeri in posizioni dispari
                    sommaDispari += numero; // Somma numeri in posizioni dispari
                }
            }

            System.out.println("\nSomma dei numeri dispari in posizioni dispari: " + sommaDispari);
        }
    }
}
