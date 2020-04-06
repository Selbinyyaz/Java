package com.syntax.class19;

public class Book {
//	Write program as a Book class   that will have 2 Constructors. While creating an object make sure:
//		Instance variables are being initialized
//		Both Constructors are being executed
	String book1, book2;

	public Book() {
		this("Book");
		System.out.println("This is a book1");
	}

	public Book(String str) {
		
		System.out.println("This is a book2");
	}

	public static void main(String[] args) {
		Book obj = new Book();
	}
}
