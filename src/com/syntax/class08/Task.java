package com.syntax.class08;

public class Task {

	public static void main(String[] args) {
		// write a program to calculate sum of odds and sum of even numbers
		//between 1 to 99
		
		int sumOdd = 0;
		int sumEven = 0;
		for (int i = 1; i <= 5; i++) {
			if (i % 2 == 0) {
				sumEven = sumEven + i;
			} else {
				sumOdd = sumOdd + i;
			}

		}
		System.out.println("Sum of odd numbers " + sumOdd);
		System.out.println("Sum of even numbers " + sumEven);
	}

}
