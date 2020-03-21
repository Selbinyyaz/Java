package com.syntax.class05;

import java.util.Scanner;

public class Hw2 {

	public static void main(String[] args) {
		//1.Write a program to find largest of three double values using if-else.if.
		// and logical operators provided by a user (numbers must be distinct)
		
		double x, y, z;
		double largest = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a first number" );
		x= scan.nextDouble();
		System.out.println("Please enter a second number" );
		y= scan.nextDouble();
		System.out.println("Please enter a third number" );
		z= scan.nextDouble();
		
		if(x>y && x>z) {
			largest=x;
		}else if(y>x && y>z) {
			largest = y;
		}else if(z>x && z>y) {//Also, you can  use else 
			largest = z;
		}
	
		System.out.println("Largest number is "+largest);
	

	}

}
