package com.syntax.clas03;

public class IfCondition {

	public static void main(String[] args) {
		//Declare a number and compare if number is larger than 100
		// if number is larger than 100 ---> my number is large
		
		System.out.println("Starting code");
		
		int num = 78;
		
		if(num>100) {
			System.out.println("my number is large ");
		}
		System.out.println("End of the program");
		
		System.out.println("------------------------------");
		
		int expectedHours = 15;
		int actualHours = 15;
		//if actual is more than expected ----> you will love java
		
		if(actualHours>= expectedHours) {//if true go inside if block
			System.out.println("you will love java");
		}else {// otherwise(if false) ---> go inside else block
			System.out.println("You will not like Java");
		}
		System.out.println("---------------------------------");
		
		double budget = 10000;
		double carPrice = 12000;
		//using if we are doing verification and selective execution 
		if(budget>carPrice) {
			System.out.println("I will buy a car");
		}else {
			System.out.println("I will not buy this car");
		}
		
	}

}
