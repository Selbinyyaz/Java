package com.syntax.class04;

public class HwTask3 {

	public static void main(String[] args) {
		// 1. Declare variable and increase by 100 using shorthand operator
		int a = 200;
		a+=100;// a=a+100
		System.out.println(a);
		
		
		//2. Declare variable and decrease by 67 using shorthand operator
		int b = 100;
		b-=67;//b=b-67
		System.out.println(b);
		
		//3. Declare variable cakePiece=11 and divide cakePiece between 4 people using shorthand operator 
		//each person should get an equal piece of cake
		double cakePiece= 11;
		cakePiece/=4;// cakePiece= cakePiece/4
		System.out.println(cakePiece);
		
		

		//4. Declare variable cakePiece=25 and divide cakePiece between 7 people . 
		//Using shorthand operator found out how many pieces of cake left after 
		//it was distributed equally among 7 people
		
		int cakePiece1=25;
		cakePiece1%=7;
		System.out.println(cakePiece1);
		
		

	}

}
