package com.syntax.class06;

import java.util.Scanner;

public class HwRepl35 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Do you need a loan?");
		String loan = scan.nextLine();
		String eligibility = null;

		if (loan.equals("true")) {
			System.out.println("What is your credit score?");
			int score = scan.nextInt();
			if (score < 600) {
				eligibility = "Not eligible";
			} else if (score > 600 && score < 700) {
				eligibility = "Maybe eligible";
			} else if (score > 701 && score < 800) {
				eligibility = "Eligible";
			} else {
				eligibility = "Definitely eligible";
			}

		} else {
			eligibility = "Unknown";
		}

		System.out.println("The eligibility is " + eligibility);
	}

}
