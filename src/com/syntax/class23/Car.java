package com.syntax.class23;

public class Car {
	String make;

	public Car(String make) {//constructor
		this.make = make;
	}

	public void display() {
		System.out.println("I have " + make);
	}

	public void start() {
		System.out.println(make + " starts by turning keys");
	}
}
class BMW extends Car{

	public BMW(String make) {
		super(make);
		
	}
	public void start() {//overriding method
		System.out.println(make+" starts by pushing button");
	}
	public void navigate() {
		System.out.println(make+" can naigate differently");
	}
	
}
class Mercedes extends Car{
	public Mercedes(String make) {
		super(make);// to call immediate constructor parent class
	}
	
	public void start() {
		System.out.println(make+" starts remotely");
	}
}

class Tesla extends Car{
	
	public Tesla(String make) {
		super(make);
	}
	
	public void start() {
		System.out.println(make+" starts by voice command");
	}
}

class Honda extends Car{
	public Honda(String make) {
		super(make);
	}
}

