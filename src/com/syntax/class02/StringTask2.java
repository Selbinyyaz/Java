package com.syntax.class02;

public class StringTask2 {

	public static void main(String[] args) {
		// write a program to find the square of the number 3.9
		// you program should say "The square of the __ is __.
		double num1 = 3.9;
		double square = num1*num1;
		System.out.println("The square of the " + num1 + " is " + square);
        System.out.println(Math.pow(3.9, 2));
		// write a program to print the area and the perimeter of a rectangle with width
		// = 5 and height=8.
		// your program should say
		// "the perimeter of a rectangle with width __ and height ___ is equal to __ and
		// the area is __"

		int width, height, area, perimeter;
		width = 5;
		height = 8;
		area = width * height;
		perimeter = 2 * (width * height);

		System.out.println("the perimeter of rectangle with width " + width + " and " + height + " is equal to "
				+ perimeter + " and the area is " + area);
     
	}

}
