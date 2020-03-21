package com.syntax.class02;

public class ModulasOperator {
	public static void main(String [] args) {
		//float can hold up to 5-7 decimals
		//double can hold up 14-15 decimals
		float f = 12.50f;
		float f1 = 2.7f;
		float result = f/f1;
		System.out.println(result);
		
		int i= 12;
		int i1 = 5;
		int result1= i/i1;
		double result2=i/i1;
		System.out.println(result1);
		System.out.println(result2);// not working
		
		// modulus
		
		int v= 16;
		int w=7;
		int mod=v%w;
		System.out.println(mod);
	
		
	}
}
