package com.syntax.class15;

public class Email {
	//Create a method createEmail().
	//Based on provided users name, lastName and email type,
	//your method should return complete email Address.
	//Example: johnsnow@gmail.com or johnsnow@yahoo.com*
	
	String createEmail(String usersName, String lastName, String emailType) {
		return usersName.concat(lastName).concat(emailType);

	}

	public static void main(String[] args) {

		Email obj = new Email();
		String a = obj.createEmail("Selbi901 ", "Altyyeva ", " szomova@yahoo.com");
		System.out.println(a);
	}

}
