package com.syntax.class28;

public abstract class Insurance {

//Create a class Insurance that will have an attribute(variable) as insuranceName 
//and unimplemented behaviour(method) as getQuote and cancelInsurance. 
//Create 3 subclasses Car, Pet, Health. 
//Car class has it’s own attribute as carModel and Class Pet has petType attribute. 
//Create 3 objects of the sub classes and store them in ArrayList. 
//Using for loop/advanced for loop/ iterator access all methods of the class. 

	String insuranceName;
	
	public Insurance(String insuranceName) {
		this.insuranceName=insuranceName;
	}

	public abstract void getQuote();

	public abstract void cancelInsurance();

}
class Car extends Insurance{
	String carModel;

	public Car(String insuranceName, String carModel) {
		super(insuranceName);
		this.carModel=carModel;
		
	}

	@Override
	public void getQuote() {
		System.out.println("1600$ offered for 6 months insurance from " + insuranceName + " for " + carModel);
		
	}

	@Override
	public void cancelInsurance() {
		// TODO Auto-generated method stub
		
	}
	
}
class Pet extends Insurance{
	
	String petType;

	public Pet(String insuranceName,String petType) {
		super(insuranceName);
		this.petType=petType;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getQuote() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cancelInsurance() {
		// TODO Auto-generated method stub
		
	}
	
}
class Health extends Insurance{

	public Health(String insuranceName) {
		super(insuranceName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getQuote() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cancelInsurance() {
		// TODO Auto-generated method stub
		
	}
	
}