package com.syntax.class19;

public class MathTeacher extends Teacher {
	String tutor;
	void solvingProblems() {
		System.out.println("I am getting extra "+tutor);
	}

}

class ChemistryTeacher extends Teacher {
	String lab;
	void testing() {
		System.out.println("We working "+courseName+" on the "+lab);
	}

}

class PianoTeacher extends Teacher {
	String instrument;
	void play() {
		System.out.println("the course title is "+courseName+" I like to play "+instrument);
	}

}