package com.syntax.class_Interface;

public interface Shape {
//Create an Interface ‘Shape’ with undefined methods as calculateArea and calculatePerimiter.
//Create 2 classes Circle & Square that implements functionality defined in the Shape Interface. 
//Test your code.
	
	static final double pi = 3.14;
	
	public abstract void calculateArea();

	public abstract void calculatePerimiter();

}
