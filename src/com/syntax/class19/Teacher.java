package com.syntax.class19;

public class Teacher {

	
	//Write a Java program called Teacher.  Identify features and behaviour of that Class.
	//Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher that would have it their own features and behaviour.
	//Test all 4 classes 
		
	static String courseName;
	String teacherTitle;
	
	
	public static void main(String[] args) {
		MathTeacher obj=new MathTeacher();
		obj.tutor="Math";
	    obj.solvingProblems();
		
		ChemistryTeacher obj1=new ChemistryTeacher();
		courseName="Chemistry";
		obj1.lab="laboratory";
		obj1.testing();
		
		PianoTeacher obj2=new PianoTeacher();
		courseName="Piano";
		obj2.instrument="piano";
		obj2.play();
		
	}
		
	

}
