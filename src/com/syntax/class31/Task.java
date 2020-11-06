package com.syntax.class31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Task {

	public static void main(String[] args) throws IOException {
		
		String filePath="/Users/agamselbi/eclipse-workspace/JavaBasics/configs/Browser.properties";
         

		
		FileInputStream fileInput=new FileInputStream(filePath);
		
		Properties prop=new Properties();
		prop.load(fileInput);
		
		String browser=prop.getProperty("browser");
		System.out.println(browser);
		
		
		
		//getting all keys from object
		Set<Object>key=prop.keySet();
		for(Object k:key) {
			System.out.println(k);
		}
	}

}
