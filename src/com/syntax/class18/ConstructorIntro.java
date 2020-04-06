package com.syntax.class18;

public class ConstructorIntro {
	
	public static void main(String[] args) {
		// = creating an Object and calling a constructor
		
		ConstructorIntro obj = new ConstructorIntro();

		System.out.println("Code after constructor");

		// calling method
		obj.hello();

	}

	void hello() {
		System.out.println("Hello Class");

	}

}
