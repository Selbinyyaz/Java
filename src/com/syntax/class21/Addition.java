package com.syntax.class21;

public class Addition {
	//Method overloading by changing number of parameters
		void add(int num, int num1) {
			System.out.println(num+num1);
		}
		
		void add(int num, int num1, int num2) {
			System.out.println(num+num1+num2);
		}
		
		void add(int num, int num1, int num2, int num3) {
			System.out.println(num+num1+num2+num3);
		}
		
		//Method overloading by changing type of parameters
		void add(int num1, double num2) {
			System.out.println(num1+num2);
		}
		
		void add(double num1, double num2) {
			System.out.println(num1+num2);
		}


}
 class AdditionTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition obj=new Addition();
		obj.add(10.99, 10.99);
		obj.add(10, 10.99);
		obj.add(10, 10, 10);
	}

}
