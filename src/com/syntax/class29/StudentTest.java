package com.syntax.class29;

import java.util.*;


public class StudentTest {

	public static void main(String[] args) {
		
		Set<Student1> studentType = new HashSet<>();
		studentType.add(new Teacher("Salman", 34562839));
		studentType.add(new Engineer("Gul", 44562839));
		studentType.add(new Doctor("John", 74562839));
		
		Iterator<Student1>stu=studentType.iterator();
		while(stu.hasNext()) {
			stu.next().display();
		}
		
	}

}
