package com.syntax.class23;

public class FinalExamples {
	final String str = "I love java";

	final void saySmth(String str) {
		System.out.println(str);
	}

	public static void main(String[] args) {

		FinalExamples obj = new FinalExamples();
		obj.saySmth("hello");
		// obj.str="I do not like java";CE: final variables cannot be modified
	}

}
class Childclass extends FinalExamples{
	//CE: Cannot override the final method from FinalExamples
//	void saySmth(String str) {
//		System.out.println("----");
//	}

}