package org.lessons.java.snackbonus;

import java.util.Random;

import java.util.Scanner;

public class Snack8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Vuoi iniziare a creare una lista di numeri?: ");
        String answer = sc.nextLine();
        sc.close();

        if (!"si".equalsIgnoreCase(answer)) {
            System.out.println("Nessuna lista di numeri creata.");
        } else {
            Random random = new Random();
            int[] numeriCasuali = random.ints(10, 100, 151).toArray();

            System.out.print("\nNumeri casuali generati: ");
            int somma = 0;
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

            for (int i = 0; i < numeriCasuali.length; i++) {
                int numero = numeriCasuali[i];
                System.out.print(numero + " ");

                if (numero < min) {
                    min = numero;
                }

                if (numero > max) {
                    max = numero;
                }

                // per la media si parte da somma = 0, somma tutti i numeri (numero) ...
                somma += numero;
            }

            // ... e qui divide la somma per la lunghezza dei numeri totali nell'array
            double media = (double) somma / numeriCasuali.length;

            System.out.println("\n\nNumero più basso: " + min);
            System.out.println("Numero più alto: " + max);
            System.out.println("Media: " + media);
        }
    }
}