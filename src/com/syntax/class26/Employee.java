package com.syntax.class26;

public class Employee {
// to achieve encapsulation we need to do private variable
	private String name;
	private int age;
	private double salary;
	
	// define public methods to give an access to private variables
	//getters
	public String getName() {
		return name;
	}

	public int getAge() {
      return age;
	}
	public double getSalary() {// it not always be getters and setters
		return salary;
	}
	//setters
	public void setName(String name) {
		if(!name.isEmpty() && name.length()>3) {
		this.name=name;
		}
	}
	public void setAge(int age) {
		if(age>1) {
		this.age=age;
		}
	}
	public void setSalary(double salary) {
		this.salary=salary;
	}
}
