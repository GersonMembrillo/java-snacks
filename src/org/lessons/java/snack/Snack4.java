package org.lessons.java.snack;

import java.util.Scanner;

public class Snack4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("PALINDROMO!\n");

        System.out.print("Scrivi una parola: ");
        String word = sc.nextLine();
        sc.close();
        
        // il replaceAll rimuove gli spazzi, toLowerCase rende tutto minuscolo
        String cleanedWord = word.replaceAll("\\s", "").toLowerCase();

        // Questa riga serve a invertire la parola, l'if di sotto a confrontarle
        String reversedWord = new StringBuilder(cleanedWord).reverse().toString();

        if (cleanedWord.equals(reversedWord)) {
            System.out.println("\nLa parola è un palindromo.");
        } else {
            System.out.println("\nLa parola non è un palindromo.");
        }
    }
}





