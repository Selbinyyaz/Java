package com.syntax.class26;

public class RegistrationTest {

	public static void main(String[] args) {
		
		Registration register=new Registration();
		register.setUserName("Selbi901");
		System.out.println("Username is "+register.getUserName());
		
		register.setEmail("selbi901@yahoo.com");
		System.out.println(register.getEmail());
		
		register.setPassword("ghw");
		System.out.println(register.getPassword());

	}

}
