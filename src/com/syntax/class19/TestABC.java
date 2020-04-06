package com.syntax.class19;

public class TestABC {
	public static void main(String[] args) {
		B obj=new B();
		C obj1=new C();
		obj.name="Selbi";
		obj.age=30;
		A.salary=203100;
		obj.display();
		obj.printF();
		obj.job="Tester";
		obj.work();
		obj1.company="Apple";
		obj1.displayInfo();
	}

}
