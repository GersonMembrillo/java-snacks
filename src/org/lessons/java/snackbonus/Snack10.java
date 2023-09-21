package org.lessons.java.snackbonus;

import java.util.Random;
import java.util.Scanner;

public class Snack10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Vuoi iniziare a creare una lista di numeri?: ");
        String answer = sc.nextLine();
        sc.close();

        if (!"si".equalsIgnoreCase(answer)) {
            System.out.println("Nessuna lista di numeri creata.");
        } else {
            Random random = new Random();
            int[] numeriCasuali = random.ints(10, 100, 1001).toArray();
            
            for (int i = 0; i < numeriCasuali.length; i++) {
                int numero = numeriCasuali[i];
                System.out.print(numero + " ");}

            // Stampa dei vari elementi, un po troppi for
            System.out.println("\n\nElementi pari:\n");
            for (int numero : numeriCasuali) {
                if (numero % 2 == 0) {
                    System.out.println(numero);
                }
            }

            System.out.println("\n\nElementi dispari:\n");
            for (int numero : numeriCasuali) {
                if (numero % 2 != 0) {
                    System.out.println(numero);
                }
            }

            System.out.println("\n\nElementi in indice pari:\n");
            for (int i = 0; i < numeriCasuali.length; i += 2) {
                System.out.println(numeriCasuali[i]);
            }

            System.out.println("\n\nElementi in indice dispari:");
            for (int i = 1; i < numeriCasuali.length; i += 2) {
                System.out.println(numeriCasuali[i]);
            }
        }
    }
}
