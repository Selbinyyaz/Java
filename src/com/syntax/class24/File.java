package com.syntax.class24;

public abstract class File {
//Create a class File that will have the following behaviors: open, edit, close. 
//Edit and close are implemented method while open is an abstract. 
//Create 3 subclasses: JavaFile, WordFile, PDFFile that will provide specific implementation of open behaviour:
//Example: to open .java file we need notepad++ or sublime text, to open .doc file we need Microsoft word to be installed etc
	public void edit() {
		System.out.println("To edit file we need to click edit");
	}

	public void close() {
		System.out.println("to close file on mac we need to press Control-Alt-Delete on a PC");
	}

	public abstract void open();

}

class JavaFile extends File {

	@Override
	public void open() {
		System.out.println("to open .java file we need notepad++ or sublime text");

	}

}

class WordFile extends File {

	@Override
	public void open() {
		System.out.println("to open .doc file we need Microsoft word to be installed");

	}

}

class PDFFile extends File {

	@Override
	public void open() {
		System.out.println("to open pdf file we need Adobe Acrobat Reader");

	}

}
