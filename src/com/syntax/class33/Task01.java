package com.syntax.class33;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		/*
		How would handle InputMismatchException? 
		Input Mismatch Exception when user enters mismatch value then programmer expected.
		*/
		//if we try to enter String as input. 
		//it'll throw InputMismatchException
		Scanner scan = new Scanner(System.in);
		int num = 0;
		System.out.print("Enter an integer: ");
		try {
			num = scan.nextInt();
		} catch (Exception e) {
			System.out.println("Exception name is: "+e);
		}

	}

}
