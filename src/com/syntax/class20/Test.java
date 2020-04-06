package com.syntax.class20;

public class Test {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.empNumber = 101;
		emp.salary=90000;
		emp.getPaid();
		Employee.company="ABS";
		Employee.work();
		

		ScrumTeam obj = new ScrumTeam();
		obj.ceremonies = "daily standup";
		obj.attendMeetings();
		
		Tester obj1 = new Tester();
		obj1.salary = 75000;
		Employee.company = "Apple";
		obj1.test();
	}

}
