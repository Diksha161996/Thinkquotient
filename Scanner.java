package com.reversestring;

public class Scanner {

	public static void main(String[] args) 
	{
		
		java.util.Scanner scn= new java.util.Scanner(System.in);	
		System.out.println("enter your name");
		string name = scn.next();
		System.out.println("enter your age");
		int age = scn.nextInt();
		System.out.println("enter your gender");
		char c = scn.next().charAt(0);
		System.out.println("Name="+name+",Age="+age+",Gender="+c);
	}

}
