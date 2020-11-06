package com.syntax.class34;

public class Task01 {

	public static void main(String[] args) {

		ageEligibility(13);

	}

	public static void ageEligibility(int age) {

		if (age < 16) {
			throw new RuntimeException();
		} else {
			System.out.println("You are eligible to get driver license");
		}

	}
}
