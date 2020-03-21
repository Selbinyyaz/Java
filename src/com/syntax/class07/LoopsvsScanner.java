package com.syntax.class07;

import java.util.Scanner;

public class LoopsvsScanner {

	public static void main(String[] args) {
		// we want to ask user's name and print Good afternoon____;
		Scanner scan;
		String name;
		int num = 1;

		scan = new Scanner(System.in);
		while (num <= 5) {
			System.out.println("What is your name?");
			num++;
			name = scan.nextLine();
			System.out.println("Good afternoon " + name);

		}

	}

}
