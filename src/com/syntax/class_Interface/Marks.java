package com.syntax.class_Interface;

public abstract class Marks {
//We have to calculate the average of marks obtained in three subjects by student A and by student B.
//Create class ‘Marks’ with an abstract method ‘getPercentage’ that will be returning the average percentage of marks. 
//Provide implementation of abstract method in classes ‘A’ and ‘B’. 
//The constructor of student A takes the marks in three subjects as its parameters and 
//the marks in four subjects as its parameters for student B. 
//Test your code
	int math;
	int science;
	int music;

	Marks(int math, int science, int music) {
		this.math = math;
		this.science = science;
		this.music = music;
	}

	public abstract double getPercentage();
}
class A extends Marks{

	A(int math, int science, int music) {
		super(math, science, music);
		
	}

	@Override
	public double getPercentage() {//implementation
		double getPercentg=(math+science+music)/3;
		return getPercentg;
	}
	
}
 class B extends Marks{
	 int art;

	B(int math, int science, int music, int art) {
		super(math, science, music);
		this.art=art;
		
	}

	@Override
	public double getPercentage() {
		
		double getPercentg=(math+science+music+art)/4;
		return getPercentg;
	}
	
}
