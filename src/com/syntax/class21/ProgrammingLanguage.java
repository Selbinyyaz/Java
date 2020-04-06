package com.syntax.class21;

public class ProgrammingLanguage {
	String name;
	String variable;

	public ProgrammingLanguage(String name, String variable) {
		this.name = name;//calls current class constructor
		this.variable = variable;
	}
}

class Java extends ProgrammingLanguage {

	String constructor;

	Java(String name, String variable, String constructor) {
		super(name, variable);//calls immediate parent class constructor
		this.constructor = constructor;
	}

	public void details() {
		System.out.println(name + " can have variables " + variable + " and constructor " + constructor);
	}
}

//class JavaScript extends ProgrammingLanguage{
//
//public void details() {
//	System.out.println(name+" can have variables "+variable);
//}
//}

