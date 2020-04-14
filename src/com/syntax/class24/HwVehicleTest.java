package com.syntax.class24;

public class HwVehicleTest {

	public static void main(String[] args) {
		
		//HwVehicle bus=new Bus("blue","bus");// because it is abstract class
		HwVehicle bus=new Schoolbus("yellow", "Schoolbus", "bus");
		bus.start();
		bus.brake();
		bus.drive();
	}

}
