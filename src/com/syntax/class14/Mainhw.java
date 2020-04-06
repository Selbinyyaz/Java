package com.syntax.class14;

public class Mainhw{

//	//Create a class 'Main' (please do not make it public as Repl will give you an error)
//	Inside class String variable 'name' and integer variable 'roll_no'. 
//
//	Creating an object of the class and assign the value of 2 to roll_no and value of "John" to name
//
//	Your program should print the following:
//	Name is John and roll number is 2
	String name;
	int roll_no;

	public static void main(String[] args) {
		Mainhw obj = new Mainhw();  // creates an object of the class
		obj.name = "John";
		obj.roll_no = 2;
		
		System.out.println("Name is "+obj.name+" roll number is "+obj.roll_no);
	}
}
