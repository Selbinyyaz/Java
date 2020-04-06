package com.syntax.class22;

public class Employee {
	double salary;

	void getPaid() {
		System.out.println("Employee get's paid " + salary);
	}

	void work() {
		System.out.println("Employee works");
	}
}

class FulltimeEmployee extends Employee {

}

class PartimeEmployee extends Employee {

}

class Constractor extends Employee {
	double hourlyRate;

	void getPaid() {// method overriding-->the sub class has the same return type.
		System.out.println("Constractor get's paid ");
	}
}