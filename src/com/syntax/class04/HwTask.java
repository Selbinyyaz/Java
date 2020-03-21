package com.syntax.class04;

import java.util.Scanner;

public class HwTask {

	public static void main(String[] args) {
		// Create a Java program that will ask if user has a credit card or not.
		// If you user does not have a credit card then offer them.
		// If they do have one ask what is balance on the card?
		// If balance of the card is larger than 1000, tell them to pay off immediately,
		// otherwise you can tell them that they can spend more.

		Scanner scan = new Scanner(System.in);
		System.out.println("Do you have credit card or not");
		String card = scan.nextLine();

		if (card.equals("yes")) {

			System.out.println("What is balance on the card?");
			int num = scan.nextInt();
			
			if (num > 1000) {
				System.out.println("pay of immediatly");
			} else {
				System.out.println("you can spend more");
			}
		} else {
			System.out.println("do you want credit card?");
		}
	}
}
