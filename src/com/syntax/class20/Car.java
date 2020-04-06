package com.syntax.class20;

public class Car {
	String make, model;
	
	public Car() {
		System.out.println("I am parent constructor");
	}
}
class Mercedes extends Car{
	
	public static void main(String[] args) {
		Mercedes obj=new Mercedes();
	}
}