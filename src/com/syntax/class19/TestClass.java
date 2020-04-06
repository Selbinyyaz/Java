package com.syntax.class19;

public class TestClass {

	public static void main(String[] args) {
		Dog dog=new Dog();
 		//access variables from own class
 		dog.breed="Husky";
 		//access variables from parent class
 		dog.color="Grey";
 		dog.fur="Too much";
 		dog.size="Big";

 		//access method from own class
 		dog.bark();
 		////access methods from parent class
 		dog.beWild();
 		dog.eat();
 		dog.sleep();
 		Dog.age=2;//  public static int age;-->on Animals class;
 		Dog.display();//public static void display() ---> on animal class method;

 		System.out.println("---------------------------");

 		Animals animal=new Animals();
 		//can access only features define within it is class
 		animal.color="Any";
 		animal.size="Any";
 		animal.fur="Any";

 		animal.sleep();
 		animal.eat();
 		animal.beWild();

 	}

}
