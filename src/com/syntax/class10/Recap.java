package com.syntax.class10;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String [] cities= {"Washington","Los Angeles","New York","Dallas","Little Rock"};
     //I live in Little Rock
     System.out.println("I live in "+cities[4]);
     
     int x=1;
     System.out.println(cities[x]);
     x+=3;
     System.out.println("I moved to "+cities[x]);
     
     //how many elements stored inside an array?
     int arraySize=cities.length;
     System.out.println("Total elements "+arraySize);
     //How can we access last element from an array?
     System.out.println(cities[arraySize-1]);
     //access all elements from an array
     //cities[0],cities[1]
     for(int i=0;i<arraySize;i++) {
    	 System.out.println(cities[i]);
     }
    
	}

}
