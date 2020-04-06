package com.syntax.class17;

public class StaticKeywordTest1 {
	public static void main(String[] args) {
		//access static members of another class
		StaticKeyword1.brand="Android";
		StaticKeyword1.touchScreen=true;
		StaticKeyword1.displayGeneralInfo();
		
		//access instance members of another class
		StaticKeyword1 sk=new StaticKeyword1();
		sk.color="red";
		sk.memory=128;
		sk.displaySpecifications();
		
		StaticKeyword1 sk1=new StaticKeyword1();
		sk1.color="red";
		sk1.memory=128;
		
		StaticKeyword1 sk2=new StaticKeyword1();
		sk2.color="red";
		sk2.memory=128;
		sk2.brand="Nokia";// brand will change for all instances
		
		//not the right way access static method
		sk2.displayGeneralInfo();
		sk1.displayGeneralInfo();
		sk.displayGeneralInfo();
		
		
	}

}
