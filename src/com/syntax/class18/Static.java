package com.syntax.class18;

public class Static {
	static String ss;
	  
	  public static void main(String[]args){
	    ss="Welcome To Syntax Technologies";
	    System.out.println(ss);
	    
	    Static.ss="Welcome To Syntax Technologies";
	    System.out.println(ss);
	    
	    Static obj=new Static();
	    obj.ss="Welcome To Syntax Technologies";
	    System.out.println(ss);
	  }

}
