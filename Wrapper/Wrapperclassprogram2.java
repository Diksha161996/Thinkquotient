package com.collection;

public class Wrapperclassprogram2 {

	public static void main(String[] args) {
		int a=234;
		boolean b=true;
		double d=344.44;
		String s="364779";
		
		//wrapper class
		 Integer i=a;
		 Boolean b1=b;
		 
		 // boxing
		 Double d1=new Double(d);
		 
		 //unboxing
		 System.out.println(i.intValue());
		 System.out.println(b1.booleanValue());
		 System.out.println(d1.doubleValue());
		 System.out.println(s);
		 int a1=Integer.parseInt(s);
		    double d2=Double.parseDouble(s);
		    System.out.println(a1);
		    System.out.println(d2);
}
}