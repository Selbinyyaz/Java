package com.syntax.class21;

public class Userclass {
//Write program: userClass  that has a constructor that initializes instance variable name and mobile number. 
//Create a subclass  userInfo that will have user address variable and
//it also being initialized through constructor call. Print users name, mobile number and address in userDetails method. Test your code.
	
	String name;
	long mobileNumber;

	Userclass(String name, long mobileNumber) {
		this.name = name;
		this.mobileNumber = mobileNumber;

	}
}

class Userinfo extends Userclass {
	String adress;

	Userinfo(String name, long mobileNumber, String adress) {
		super(name, mobileNumber);
		this.adress = adress;

	}

	void userDetails() {
		System.out
				.println("The user name is " + name + " and mobile number is " + mobileNumber + ".Adress is " + adress);
	}
}