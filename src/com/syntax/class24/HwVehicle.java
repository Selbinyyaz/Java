package com.syntax.class24;

public abstract class HwVehicle {
//vehicle-->bus-->schoolBus
	String color;

	HwVehicle(String color) {
		this.color = color;
	}

	public void drive() {
		System.out.println("Vehicle drives");
	}

	public void stop() {
		System.out.println("vehicle stops");
	}

	public abstract void start();

	public abstract void brake();
}

abstract class Bus extends HwVehicle {
	String carType;

	Bus(String color, String carType) {
		super(color);
		this.carType = carType;

	}

	@Override
	public void brake() {
		System.out.println(carType + " have brake");
	}
}

class Schoolbus extends Bus {
	String make;

	Schoolbus(String color, String carType, String make) {
		super(color, carType);
		this.make = make;
	}

	@Override
	public void start() {
		System.out.println(make + " starts with key");

	}
}
