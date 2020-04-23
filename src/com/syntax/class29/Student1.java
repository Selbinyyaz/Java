package com.syntax.class29;

public abstract class Student1 {
	//3.Create a Set collection that will hold Objects of Student Type. 
	//In this set we do not care about the insertion order. 
	//Each student object should have name and studentID. Display name of each student.	
	String name;
	long studentID;

	public Student1(String name, long studentID) {
		this.name = name;
		this.studentID = studentID;
	}

	public abstract void display();

}

class Teacher extends Student1 {

	public Teacher(String name, long studentID) {
		super(name, studentID);

	}

	@Override
	public void display() {
		System.out.println("Student is " + name + " and student Id: " + studentID);

	}

}

class Engineer extends Student1 {

	public Engineer(String name, long studentID) {
		super(name, studentID);

	}

	@Override
	public void display() {
		System.out.println("Student is " + name + " and student Id: " + studentID);

	}

}

class Doctor extends Student1 {

	public Doctor(String name, long studentID) {
		super(name, studentID);

	}

	@Override
	public void display() {
		System.out.println("Student is " + name + " and student Id: " + studentID);

	}

}
