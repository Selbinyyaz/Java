package com.syntax.class26;

public class DoctorTest {

	public static void main(String[] args) {
		Doctor doc=new Doctor();
		doc.setEmail("szomova@yahoo.com");
		System.out.println(doc.getEmail());
		doc.setEmail("");
		System.out.println(doc.getEmail());
		doc.setEmail("szomova@gmail.com");
		System.out.println(doc.getEmail());

	}

}
