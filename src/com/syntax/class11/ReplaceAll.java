package com.syntax.class11;

public class ReplaceAll {

	public static void main(String[] args) {
		
		String a = "Computer science";
		System.out.println(a.replace('o', '*'));
		System.out.println(a.replaceAll("[A-z]", "*"));
		String str="Phone number is 1234567890";
		System.out.println(str);
		str=str.replaceAll("[A-Za-z]", "");
		
		System.out.println(str);
		
		String str1="Hello1234789";
		str1=str1.replaceAll("[0-9]", "");
		System.out.println(str1);
		
		str1=str1.replaceAll("[^A-Za-z]", "");
		System.out.println(str1);
		
		String str2="Hello123^&^&^&*^!";
		str2=str2.replaceAll("[^A-Za-z0-9]", "");
		System.out.println(str2);
		
		String subject="Java";
		
		subject=subject.replace("a", "e").replace("J", "I").toUpperCase();
		System.out.println(subject);
		System.out.println(subject.replaceFirst("E", "g"));
		


	}

}
