package com.syntax.class18;

public class ClassStudents {
//	Write a java program of Class. Students that takes students name and 3 subject grades. 
//Inside your class also have a method to Calculate Average Grade. 
//Test Student class for 5 different students with different marks. 
//Your program should print an average mark of each students name.
//	NOTE: please use different names for instance and local variables.
	
	String name;
	int grade1,grade2,grade3;
	
	ClassStudents(String stname, int gr1, int gr2, int gr3){
		name=stname;
		grade1=gr1;
		grade2=gr2;
		grade3=gr3;
		System.out.println(stname+" average grade is :"+(gr1+gr2+gr3)/3);
	}
	
	public static void main(String[] args) {
		ClassStudents obj=new ClassStudents("John",90,80,70);
		ClassStudents obj1=new ClassStudents("Bob",92,85,60);
	}
	
	
}
