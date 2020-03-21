package com.syntax.class14;

public class Phone {
	//Create a Class “Phone”. 
	//Create 3 Objects of it: iPhone, Android, Nokia with specific  attributes and behaviors.
	String make;
	String model;
	String color;

	public static void main(String[] args) {
		Phone phone1 = new Phone();
		phone1.make = "iPhone";
		phone1.model = "5s";
		phone1.color = "Black";
		phone1.ring();

		System.out.println(phone1.make);

		Phone phone2 = new Phone();
		phone2.make = "Android";
		phone2.model = "s10";
		phone2.color = "white";

		Phone phone3 = new Phone();
		phone1.make = "Nokia";
		phone1.model = "3.1 C";
		phone1.color = "Red";

	}
	// define behavior
	void memory() {
		System.out.println(make+"");
	}
	void ring() {
		System.out.println(make+" will ring until you get phone");
	}

}
