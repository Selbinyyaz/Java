package com.syntax.class05;

public class LogicalNot {

	public static void main(String[] args) {
		// NOT(!) - reverse the condition
		boolean b =! true;
		boolean val =! false;
		
		System.out.println(b);
		System.out.println(val);
		
		boolean isCold=true;
		
		if(!isCold) {// not true. it is false
			System.out.println("Hello");
		}else {
			System.out.println("bye");
		}
       String day1 = "Tuesday";
       
       
       //if it is not Monday or Friday--->Find me at Syntax
       //the day is not Monday and the day is not Friday
       if(!day1.equals("Monday")&& ! day1.equals("Friday")) {
    	   System.out.println("Find me at Syntax");
       }
       // the day is not( Monday and Friday)
       if(!(day1.equals("Monday")&&  day1.equals("Friday"))) {
    	   System.out.println("Find me at Syntax");
	}
       // both ways are correct!!!!
	}
}
