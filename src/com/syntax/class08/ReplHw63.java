package com.syntax.class08;

import java.util.Scanner;

public class ReplHw63 {
	public static void main(String[] args) {
		//Write a for loop that will print out a series of numbers starting at 0 
		//and ending at the x(value must be taken from a user), exclusive.

		Scanner inp;
		int x;
		System.out.print("In:");
		// write code under on step 8
		inp = new Scanner(System.in);
		x = inp.nextInt();
		for (int i = 0; i < x; i++) {
			System.out.print(i + " ");

		}

	}

}
