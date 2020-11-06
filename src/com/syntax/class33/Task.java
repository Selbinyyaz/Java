package com.syntax.class33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task {
	
	public static List<Exception> getAllExceptions() {
		List<Exception>list=new ArrayList();
		try {
			Thread.sleep(2000);//problematic code
		} catch (InterruptedException e) {
			
			list.add(e);
		}
		String fpath="";
		try {
			FileInputStream file=new FileInputStream(fpath);//
		} catch (FileNotFoundException fne) {
			
			list.add(fne);
		}
		int a=10;
		int b=0;
		
		try {
			System.out.println(a/b);//problematic code
		}catch(ArithmeticException ea) {
			
			list.add(ea);
		}
		int[]array= {1,2,3};
		try {
			System.out.println(array[4]);
		}catch(ArrayIndexOutOfBoundsException ae) {
			
			list.add(ae);
		}
		return list;
		
		
	}

	public static void main(String[] args) {
		
// Create a static method that will return a List of Exceptions.
//Inside your method create objects of 4 exception classes using try and
//catch blocks and store them inside your list.
//Call your method inside main and print name and details of all Exception objects.
      
		List<Exception>llist=getAllExceptions();
		for (Exception exception : llist) {
			String message=exception.getMessage();
			System.out.println(message);
		}
		System.out.println("--------------------");
		Iterator<Exception>it=llist.iterator();
		while(it.hasNext()) {
			String msg=it.next().getMessage();
			System.out.println(msg);
		}
	}

}
