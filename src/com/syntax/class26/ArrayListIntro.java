package com.syntax.class26;

import java.util.ArrayList;

public class ArrayListIntro {

	public static void main(String[] args) {
		//create an Array
		int [] numbers= new int[2];//array are fixed in size. there is limitation
	    numbers[0]=10;
	    numbers[1]=11;
	  
	    //create an ArrayList to store numbers
      ArrayList<Integer>number=new ArrayList<>();//ArrayList is dynamic in size 
      number.add(10);//0----->OUTBOXING
      number.add(20);//1
      number.add(30);//3
      number.add(40);//4
      
     //Access in item--->use get();
      System.out.println(number.get(2));
	 //To know containing Arraylist---->use contain();
      System.out.println(number.contains(20)+"--->20 contains in arraylist");
      
      System.out.println("------ ------- -----");
      
      for(int i=0; i<number.size();i++) {
    	  System.out.println(number.get(i));//auto unboxing
      }
      System.out.println(" ------ ------- -----");
      
      for(int num:number) {
    	  System.out.println(num);
      }

	}

}
