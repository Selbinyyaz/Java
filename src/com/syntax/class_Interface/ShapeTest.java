package com.syntax.class_Interface;

public class ShapeTest {

	public static void main(String[] args) {
		
		Shape obj = new Circle();
		Circle obj1 = (Circle) obj;// downcasting
		obj1.r = 5;
		obj.calculateArea();
		obj.calculatePerimiter();

	}

}
