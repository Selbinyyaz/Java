package com.syntax.class33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class HandlingException {

	public static void main(String[] args) {

		try {
			Thread.sleep(2000);//problematic code
		} catch (InterruptedException e) {
			System.out.println("catched InterruptedException exception");
		}
		String fpath="";
		try {
			FileInputStream file=new FileInputStream(fpath);//
		} catch (FileNotFoundException fne) {
			System.out.println("catched FileNotFoundException exception");
		}
		int a=10;
		int b=0;
		
		try {
			System.out.println(a/b);//problematic code
		}catch(ArithmeticException ea) {
			System.out.println("catch ArithmeticException exception");
		}
		

	}
}
