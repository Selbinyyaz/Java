package com.syntax.class14;

public class Garage {

	public static void main(String[] args) {
		// build individual objects
		Car car1 = new Car();
		car1.make = "Lamborghini";
		car1.model = "Gallardo";
		car1.year = 2020;
		car1.color = "Blue";

		car1.drive();
		car1.accelerate();
		car1.makeNoise();
		car1.stop();
		System.out.println("------------------");

		Car car2 = new Car();
		car2.make = "Bmw";
		car2.model = "m5";
		car2.year = 2020;
		car2.color = "Blue";

		// print BMW
		System.out.println(car2.make);
		car2.drive();
		car2.accelerate();
		car2.makeNoise();
		car2.stop();


	}

}
