package com.syntax.class06;

import java.util.Scanner;

public class HwCalculator {

	public static void main(String[] args) {
		//Using scanner class create calculator. 
		//Allow user to enter 2 numbers and operator(+,-,*,/). 
		//Based on operator provide the result to user.
		
		int num1, num2;
		char operator;
		int result;

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter two numbers ");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		System.out.println("Please enter operator:+,-,*,/");
		operator = scan.next().charAt(0);

		switch (operator) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / num2;
			break;
		default:
			result = 0;

		}
		System.out.println("Your number is " + result);
	}
		

	

}
