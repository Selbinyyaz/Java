package com.syntax.class24;

public class FileTest {

	public static void main(String[] args) {
		
		File javafile=new JavaFile();
		javafile.open();
		javafile.edit();
		javafile.close();
		
		File wordfile=new WordFile();
		wordfile.open();
		wordfile.edit();
		wordfile.close();
		
		File pdffile=new PDFFile();
		pdffile.open();
		
	}

}
