package com.syntax.class06;

import java.util.Scanner;

public class HwRepl36 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
	    System.out.println("Please enter two strings");
	    String word1= scan.nextLine();
	    String word2= scan.nextLine();
	    System.out.println("Please enter two numbers");
	    int num1= scan.nextInt();
	    int num2= scan.nextInt();
	    String operator = null;
	    
		if (word1.equals(word2) && num1 == num2) {
			operator = "AND";
		} else if (word1.equals(word2) || num1 == num2) {
			operator = "OR";

		} else if (!(word1.equals(word2)) && num1 != num2) {
			operator = "None";
		}

		System.out.println(operator);

	}

	}
