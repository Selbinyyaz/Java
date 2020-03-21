package com.syntax.class05;

import java.util.Scanner;

public class Hw02 {

	public static void main(String[] args) {
		 
		//Write a program for user to enter his/hers birth month. 
		//Based on the month define the season.
		//Example: if user is born in June, July or August → season =“Summer”.
		//At the end of the program we should see output as “You were born ______“.
          
		String month, season;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your birth month");
		 month = scan.nextLine();
		
		
		
		if(month.equals("June") || month.equals("July")|| month.equals("August")) {
			season = "Summer";
		
		}else if(month.equals("September") || month.equals("October")|| month.equals("November")) {
			season="Fall";
		}else if(month.equals("December") || month.equals("January")|| month.equals("February")) {
			season="Winter";
		}else {
			season = "Spring";
		}
		
		System.out.println("You were born "+season);
	}

}
