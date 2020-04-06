package com.syntax.class18;

public class ConstructorTask {
//Write a program that will have a constructor: one with parameters and second without any parameters. 
//Create a separate Test class where you will execute both of the constructors.
	 
	ConstructorTask() {
		System.out.println("This is without any parameters");
	}

	ConstructorTask(String str) {
		System.out.println("This is one with parameters " + str);
	}

	
}
