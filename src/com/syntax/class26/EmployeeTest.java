package com.syntax.class26;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee obj=new Employee();
		obj.setName("John");
		obj.setAge(20);
		obj.setSalary(23000);
		System.out.println("Name is "+obj.getName()+" age is "+obj.getAge()+" salary is "+obj.getSalary());
		
	}

}
