package com.syntax.class26;

public class Doctor {
//to achieve encapsulation
	//1.make variables/private fields
	private long lisenseID;
	private long phoneNumber;
	private String email;
	
	//2. make public getters and setters to access those variables
	public void setEmail(String email) {
		if(!email.isEmpty()) {
			if(email.contains("gmail")) {
				this.email=email;
			}else {
				System.out.println("email must be gmail type");
			}
		}else {
			System.out.println("email cannot be empty");
		}
	}
	public String getEmail() {
		return email;
		
	}
	
}
