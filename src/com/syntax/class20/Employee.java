package com.syntax.class20;

public class Employee {
	static String company;
	int empNumber;
	double salary;

	void getPaid() {
		System.out.println("Employee's salary is " + salary);
	}

	static void work() {
		System.out.println("Employee works at " + company);
	}
}
