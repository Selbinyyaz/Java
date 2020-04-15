package com.syntax.class27;

public abstract class Food {
//2. hw create food class that will have 3 undefined methods and it will have 4 subclasses;
//create a collection of food and using 3 ways execute methods
	
	public abstract void eat();

	public abstract void traditionalFood();

	public abstract void cook();

}

class Palow extends Food {

	@Override
	public void eat() {
		System.out.println("I like to eat Palow");

	}

	@Override
	public void traditionalFood() {
		System.out.println("It is traditional food in Turkmenistan");

	}

	@Override
	public void cook() {
		System.out.println("I like to cook turkmen palow");

	}

}

class Manti extends Food {

	@Override
	public void eat() {
		System.out.println("Manti is speacial food in Central Asia");

	}

	@Override
	public void traditionalFood() {
		System.out.println("It is also traditional food");

	}

	@Override
	public void cook() {
		System.out.println("Cooking Manti is hard");

	}

}

class Samsa extends Food {

	@Override
	public void eat() {

	}

	@Override
	public void traditionalFood() {
		// TODO Auto-generated method stub

	}

	@Override
	public void cook() {
		// TODO Auto-generated method stub

	}

}

class Taco extends Food {

	@Override
	public void eat() {
		System.out.println("I would like to try Taco");

	}

	@Override
	public void traditionalFood() {
		System.out.println("Taco is a traditional Mexican food");

	}

	@Override
	public void cook() {
		System.out.println("Trying to cook");

	}

}