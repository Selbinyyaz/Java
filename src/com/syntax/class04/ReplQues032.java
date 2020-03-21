package com.syntax.class04;

import java.util.Scanner;

public class ReplQues032 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your age");
		int age = scan.nextInt();
		System.out.println("Please enter your gender: M or F");
		String gender = scan.next();

		// If age is above 25, then check if a user entered F then the output should be
		// "Woman"
		// otherwise it should say "Man"
		// If age is below 25, then check if a user entered F then the output should be
		// "Girl"
		// otherwise it should say "Boy"

		if (age > 25) {
			if (gender.equals("F")) {
				System.out.println("Woman");
			} else {
				System.out.println("Man");
			}

		} else {
			if (gender.equals("F")) {
				System.out.println("Girl");

			} else {
				System.out.println("Boy");
			}

		}

	}
}
