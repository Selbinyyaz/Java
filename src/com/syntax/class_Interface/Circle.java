package com.syntax.class_Interface;

public class Circle implements Shape {
	
	double area;
	double c;
	int r;

	@Override
	public void calculateArea() {

		area = pi * (r * r);
		System.out.println(area);

	}

	@Override
	public void calculatePerimiter() {
		c=2*pi*r;
		System.out.println(c);

	}

}
