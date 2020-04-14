package com.syntax.class24;

public abstract class Vehicle {//abstract class--->grandparent class

	static int totalVehicles;// static variables
	String color;// instances variable

	Vehicle(String color) {// constructor with parameter
		this.color = color;// current constructor
		totalVehicles++;
	}

	public static void total() { // static method
		System.out.println("we build " + totalVehicles);

	}

	public void drive() {// method
		System.out.println("Vehicle drives");
	}

	public void stop() {
		System.out.println("Vehicle stops");
	}

	public abstract void start();// abstract method-->there is no body

	public abstract void brake();// can only be used abstract class.
}

abstract class Car extends Vehicle {// parent class or super class
	String carType;

	Car(String color, String carType) {
		super(color);// calling grandparent class constructor
		this.carType = carType;

	}

	public void brake() {// abstract
		System.out.println(carType + " have brake");
	}

}

class Tesla extends Car {// child class or subclasses
	String make;

	Tesla(String color, String carType, String make) {
		super(color, carType);
		this.make = make;
	}

	public void drive() {// overriding method
		System.out.println(make + " drives on autopilot");
	}

	@Override
	public void start() {// abstract
		System.out.println(make + " start remotely");
	}

	public void display() {
		System.out.println("we have " + color + " " + make + " " + carType);
	}
}

class Toyota extends Car {

	String make;

	Toyota(String color, String carType, String make) {
		super(color, carType);
		this.make = make;
	}

	@Override
	public void start() {
		System.out.println(make + " starts pushing button");

	}

}