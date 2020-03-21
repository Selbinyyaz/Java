package com.syntax.class06;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		// Ask user to enter their country and capture it. 
		//Once values are captured print which language user speaks.
		String country, language;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your country");
		country=scan.nextLine();
		
		switch(country) {
		case "Turkmenistan":
			language = "Turkmen";
			break;
		case "British":
			language = "English";
			break;
		case "China":
			language = "Chinese";
			break;
		case "India":
			language = "Hindi";
			break;
		default:
			language="Invalid";
		}
		System.out.println("Your language is "+language);
		

	}

}
