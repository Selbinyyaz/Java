package com.syntax.class19;

public class ThisKeyword {
	int a;
	int b;//instances variable
	
	public ThisKeyword(int a, int b){//constructor 
		this.a=a;
		this.b=b;
	}
	public void sum(int a, int b) {
		System.out.println("Sum of local variables "+(a+b));
		System.out.println("Sum of instances variables "+(this.a+this.b));
	}
	public static void main(String[] args) {
		ThisKeyword obj=new ThisKeyword(20,10);
		obj.sum(300, 200);
		
	}

}
