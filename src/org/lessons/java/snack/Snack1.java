package org.lessons.java.snack;

import java.util.Scanner;

public class Snack1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Scrivi un numero!\n");
		
		System.out.print("Inserisci un numero intero: ");
		int number = sc.nextInt();
		
		int result = number;
		
		if (number % 2 != 0) {
			
			result = number+1;
		}
		
		sc.close();
		
		System.out.println("\n-----\n\n" + result);
	}

}
