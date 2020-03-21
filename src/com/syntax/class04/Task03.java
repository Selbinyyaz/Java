package com.syntax.class04;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		// You are DMV representative and you need to ask customer their age. 
		//If they are 18 and older you will issue a driver license to them, 
		//otherwise you will offer them to get a learners permit.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What is your age?");
		int age=scan.nextInt();
		
		if(age>=18) {
			System.out.println("You can get driver lisence");
		}else {
			System.out.println("You can get permit");
		}
	}

}
