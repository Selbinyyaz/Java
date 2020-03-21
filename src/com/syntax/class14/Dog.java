package com.syntax.class14;

public class Dog {
	String breed;
	String color;
	String name;
	int age;

	public static void main(String[] args) {
		Dog dog1 = new Dog();
		dog1.breed = "Shih tzu";
		dog1.color = "yellow";
		dog1.name = "Lucy";
		dog1.age = 2;
		System.out.println(dog1.breed);
		dog1.bark();
		dog1.eat();
	}

	void bark() {
		System.out.println(name + " can bark");
	}

	void eat() {
		System.out.println(name + " can eat");
	}
}
