package com.syntax.class23;

public class CarTest {

	public static void main(String[] args) {
		BMW obj = new BMW("BMW");
		obj.display();
		obj.start();
		System.out.println("------Polymorphism-------");
		Car bmw = new BMW("BMW");
		bmw.display();
		bmw.start();
		System.out.println("------Polymorphism-------");
		Car bmw1 = new BMW("BMW");
		Car tesla = new Tesla("Tesla");
		Car merc = new Mercedes("Mercedes");
		Car honda = new Honda("Honda");

		// Car[] cars= {new BMW("BMW"),new Tesla("Tesla"),new Mercedes("Mercedes"),new
		// Honda("Honda")};// we can do two ways
		Car[] cars = { bmw1, tesla, merc, honda };

		for (Car c : cars) {
			c.start();
			c.display();
		}
		System.out.println("----------------------");
		for (int i = 0; i < cars.length; i++) {
			cars[i].display();
			cars[i].start();
		}
	}

}
