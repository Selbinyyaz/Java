package com.syntax.class31;
//shortcut for import ctrl(command)+shift+o
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PopertiesFilesReading {

	public static void main(String[] args) throws IOException {
		// to read the file:
		//1.have file
		String filePath="/Users/agamselbi/eclipse-workspace/JavaBasics/configs/Examples.properties";
		
		//2.bring object of FileInputStream
		FileInputStream fileInput=new FileInputStream(filePath);
		
		//to handle to from .properties file we need Property Class
		
		Properties prop=new Properties();
		prop.load(fileInput);
		
		String name=prop.getProperty("name");
		System.out.println(name);
		
		String city=prop.getProperty("city");
		System.out.println(city);
		//getting all keys from property file
		Set<Object> keys=prop.keySet();
		System.out.println(keys);
		for(Object key:keys) {
			System.out.println(key);
		}
		

	}

}
