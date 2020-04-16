package com.syntax.class28;



public abstract class Food {
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
