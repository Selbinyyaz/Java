package com.syntax.class23;

public class Computer {
//Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell. 
//Define common behavior within and some fields in parent class and override some of the methods in child classes
//Define some methods specific to child classes
//Create objects of child classes and store them into array. Loop through each object and execute available methods.
	
	String brand;

	public Computer(String brand) {
		this.brand = brand;
	}

	public void display() {
		System.out.println("I have " + brand + " computer");
	}

	public void opens() {
		System.out.println(brand + " opens by password");
	}
}

class Apple extends Computer {
	public Apple(String brand) {
		super(brand);
	}

	public void opens() {
		System.out.println(brand + " opens by Face ID");
	}
	public void work() {
		System.out.println(brand+" works very good");
	}
}

class Lenovo extends Computer {

	public Lenovo(String brand) {
		super(brand);

	}

	public void opens() {
		System.out.println(brand + " opens by password");
	}

}

class HP extends Computer {

	public HP(String brand) {
		super(brand);

	}

	public void opens() {
		System.out.println(brand + " opens by  automatically");
	}
}

class Dell extends Computer {

	public Dell(String brand) {
		super(brand);

	}

	public void opens() {
		System.out.println(brand + " opens by finger print");
	}
}
