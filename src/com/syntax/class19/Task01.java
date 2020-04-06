package com.syntax.class19;

public class Task01 {
	//Write program as a Student class   that has instance variables name and address.
	//Create a constructor that will initialize those variables. 
	//Print name & address of given  student using displayInfo method.
	
	String name, adress;

	public Task01(String name, String adress) {
		this.name = name;
		this.adress = adress;

	}

	public void displayInfo() {
		System.out.println("Student name " + name +" and adress is  " + adress);
	}

	public static void main(String[] args) {
		Task01 obj = new Task01("Selbi", "Little Rock");
		obj.displayInfo();
	}
}
