package com.syntax.class34;

public class Task02 {

	public static void main(String[] args) {
// Create a method checkUserName that will throw a runtime exception. 
//Method should throw an exception when entered username is less than 5 characters.
		checkUserName("Selb");
	}

	public static void checkUserName(String name) {
		if (name.length() < 5) {
			throw new RuntimeException("Use more than 5 characters");
		} else {
			System.out.println("You passed");
		}
	}
}
