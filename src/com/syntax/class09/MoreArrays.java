package com.syntax.class09;

public class MoreArrays {

	public static void main(String[] args) {
		// arrays are fixed in size
		String[] students = new String[3];
		students[0] = "Hassna";
		students[1] = "Bayramgul";
		students[2] = "Guljemal";
		// students[3]="Yunus";
		//during run time java machine will give
		// ArrayIndexOutOfBoundsException
		// System.out.println(students[3]);
		
		String[] inClassStudents=new String[5];
		inClassStudents[0]="Hichem";
		inClassStudents[1]="Tettee";
		System.out.println(inClassStudents[2]);// output will be null
		

	}

}
