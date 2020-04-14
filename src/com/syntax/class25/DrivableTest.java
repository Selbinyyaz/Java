package com.syntax.class25;

public class DrivableTest {

	public static void main(String[] args) {
		Drivable obj=new Cars();
		//Drivable.MOVE_FAST=false; final field cannot be assigned
		obj.drive();
		
		Cars obj1=new Cars();
		obj1.drive();
		obj1.stop();
		

	}

}
