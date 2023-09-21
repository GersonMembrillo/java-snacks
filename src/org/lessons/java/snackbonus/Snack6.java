package org.lessons.java.snackbonus;

import java.util.Scanner;

public class Snack6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Scrivi un numero intero positivo: ");
        String numberStr = sc.nextLine();

        int number = 0;

        for (int i = 0; i < numberStr.length(); i++) {
            char c = numberStr.charAt(i);

            if (c >= '0' && c <= '9') {
                int digit = c - '0';
                number = number * 10 + digit;
            }
        }

        System.out.println("Il numero intero è: " + number);

        sc.close();
    }
}

