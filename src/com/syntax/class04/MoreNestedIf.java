package com.syntax.class04;

public class MoreNestedIf {

	public static void main(String[] args) {
		
		//declare date and a day 
		// if day is Friday -->if date is 13-->watch a scary movie
		//                  --->if date is not 13---> watch a comedy
		
		boolean isFriday = false;//true
		int date = 13;
		
				
		if(isFriday) { // if this false then entire statement will be false
			System.out.println("today is Friday, I am going to watch a movies");
			
			if (date==13) {
				System.out.println("I will watch scary movie");
			}else {
				System.out.println("I will watch comedy movie");
			}
		}else {
			System.out.println("Today is not friday, i will not watch movie");
		}

	}

}
