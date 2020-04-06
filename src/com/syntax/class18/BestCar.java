package com.syntax.class18;

public class BestCar {
	String make, model, color;
	int year, wheels;

	public void printDetails() {//method header
		System.out.println("I have  " + year + " " + make + " model is " + model + " color is " + color + " " + year);
	}

	BestCar(String carMake, String carModel, String carColor, int carYear, int carWheels) {//constructor
		make = carMake;
		model = carModel;
		color = carColor;
		year = carYear;
		wheels = carWheels;

	}

	public static void main(String[] args) {
		//once we create our own constructor compiler WILL NOT be creating a default constructor for you!!!
		//BestCar car=new BestCar(); CE
		BestCar obj = new BestCar("BMW", "m5", "Grey", 2020, 4);
		obj.printDetails();
		
		//new BestCar("Toyota", "Camry", 2020, 2, 4, "Blue");CE: swap arguments.look the order
	}

}
