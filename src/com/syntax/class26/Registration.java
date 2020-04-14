package com.syntax.class26;

public class Registration {
//Create Registration Class in which you would have variables as email, userName and password 
//that have an access scope only within its own class. 
//After creating an object of the class user should be able to call methods and in each method separately pass values to set users email, username and password. 
//	Requirements: 
//	Valid email consider to be only yahoo
//	Valid userName and password cannot be empty and should be of length larger than 6 characters. Also valid password cannot contain userName.	

	private String email;
	private String userName;
	private String passWord;
	
	public void setUserName(String userName) {
		if(!userName.isEmpty() && userName.length()>6) {
		this.userName=userName;
		}else {
			System.out.println("Username cannot be empty and lenght must be 6 characters");
		}
	}
	public String getUserName() {
		return userName;
		
	}
	public void setEmail(String email) {
		if(email.contains("yahoo")) {
			this.email=email;
		}else {
			System.out.println("please write yahoo email");
		}
		
	}
	public String getEmail() {
		return email;
	}
	public void setPassword(String passWord) {
		if(!passWord.isEmpty() && passWord.length()>6 && (!passWord.contains(userName))) {
			this.passWord=passWord;
		}else {
			System.out.println("Password cannot be empty and length must be 6 characters");
		}
	}
	public String getPassword() {
		return passWord;
		
	}
}
