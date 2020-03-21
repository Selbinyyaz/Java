package com.syntax.class10;

import java.util.Scanner;

public class HwRepl77 {

	public static void main(String[] args) {
		// Create an array of integers that will store 5 elements taken from a user
		//Don't print any prompt message for the user
		//Then print out all the elements you have created in the first loop in reverse order. 
	
		Scanner scan = new Scanner(System.in);
		int[] num = new int[5];
		System.out.println("Input: ");
		for (int i = 0; i < num.length; i++) {

			 num[i] = scan.nextInt();
		}
		System.out.println("Output:");

		for (int i = num.length-1; i >=0; i--) {
			System.out.println(num[i]);
		}

	}

}
