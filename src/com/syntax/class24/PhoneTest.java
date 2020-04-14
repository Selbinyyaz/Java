package com.syntax.class24;

public class PhoneTest {

	public static void main(String[] args) {
		
		//new Phone()--->compile error-->cannot create object on abstract method
		
		Phone iphone=new iPhone();
 		iphone.call();
 		iphone.text();
 		iphone.takePicture(2);
 		iphone.playMusic();
 		System.out.println("------------------------------------");

 		Phone samsung=new Samsung();
 		samsung.call();
 		samsung.text();
 		samsung.takePicture(2);
 		samsung.playMusic();

	}

}
