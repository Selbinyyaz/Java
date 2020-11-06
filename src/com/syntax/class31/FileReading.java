package com.syntax.class31;

public class FileReading {

	public static void main(String[] args) {
		
		String filePath="/Users/agamselbi/eclipse-workspace/JavaBasics/configs/configuration.properties";
		
		System.out.println(filePath);
		
		String userDirectory=System.getProperty("user.dir");
		System.out.println(userDirectory);
		
		String username=System.getProperty("user.name");
		System.out.println(username);
		
		String os=System.getProperty("os.name");
		System.out.println(os);
	}

}
