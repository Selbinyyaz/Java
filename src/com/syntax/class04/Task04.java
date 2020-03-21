package com.syntax.class04;

import java.util.Scanner;

public class Task04 {
	public static void main(String[] args) {
		// Create a Java program that will ask user to input city and temperature. 
		//Your program should convert Fahrenheit into celsius and 
		//print “The temperature is the city __ is __”
		
	Scanner scan = new Scanner(System.in);
	System.out.println("What is your city name?");
	String name= scan.nextLine();
	System.out.println("What is the temperature?");
	int temp = scan.nextInt();
	int temp1=((temp - 32) * 5/9);
	System.out.println("The temperature is the city "+name+" is " + temp1);
	
	
	
	
	
	}
}
	


