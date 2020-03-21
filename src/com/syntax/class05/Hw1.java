package com.syntax.class05;

import java.util.Scanner;

public class Hw1 {
	public static void main(String[] args) {
		// Write a program that will read three inputs of scores (quiz, mid term, and
		// final scores) and
		// determine the grade based on the following rules: 
		/*
		 * if the average score >=90 → grade=A if the average score >= 70 and <90 →
		 * grade=B if the average score>=50 and <70 → grade=C if the average score<50 →
		 * grade=F
		 */

		String grade;
		double score1, score2, score3, avscore;

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter quiz score");
		score1 = scan.nextDouble();
		System.out.println("Please enter midterm quiz");
		score2 = scan.nextDouble();
		System.out.println("Please enter final score");
		score3 = scan.nextDouble();
		avscore = (score1 * 0.15) + (score2 * 0.25) + (score3 * 0.6);

		if (avscore >= 90) {
			grade = "A";
		} else if (avscore >= 70 && avscore < 90) {
			grade = "B";

		} else if (avscore >= 50 && avscore < 70) {
			grade = "C";

		} else {
			grade = "F";

		}

		System.out.println("Your Grade is " + grade);

	}

}
