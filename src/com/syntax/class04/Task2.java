package com.syntax.class04;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// You are a loan specialist and you need to ask user what is the amount of loan is needed. 
		//If loan is less than 200,000 then you would lend the money 
		//otherwise you would reject the client.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What is the amount of loan is needed?");
		int loan =scan.nextInt();
		
		if(loan<200000) {
			System.out.println("You would lend the money");
		}else {
			System.out.println("You will reject the client");
		}

	}

}
