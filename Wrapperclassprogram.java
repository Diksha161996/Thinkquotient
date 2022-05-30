package com.collection;

public class Wrapperclassprogram {

	public static void main(String[] args) {
		int a=234;
		boolean b=true;
		double d=344.44;
		//wrapper class
		 Integer i=a;
		 Boolean b1=b;
		 // boxing
		 Double d1=new Double(d);
		 //unboxing
		 System.out.println(i.intValue());
		 System.out.println(b1.booleanValue());

	}

}
