package com.syntax.class07;

public class WhilevsDoWhile {

	public static void main(String[] args) {
		// hello 5 times
		
		int num = 1;
		while (num <= 5) {// while will never execute when condition is false.
			num++;
			System.out.println("Hello");
		
		}
		System.out.println("-----------------");
		int num1 = 11;
		do {// do will be execute at least once. even if the condition is false.
			System.out.println("Hello");
			num1++;
		} while (num1 <= 5);

	}

}
