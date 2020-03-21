package com.syntax.class04;

import java.util.Scanner;

public class ReplHw2 {
	public static void main(String[] args) {
		//Create a program that will ask a user to input boolean value "Input the boolean value"
		//If the input is true or false, then the output should look like below: 
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Input the boolean value");
		boolean input = scan.nextBoolean();
		System.out.println("The input is "+input);
		
	}

}
