package com.reversestring;

public class Fibonancci {

	public static void main(String[] args) {
		
		java.util.Scanner scn= new java.util.Scanner(System.in);	
		System.out.println("enter 1st number");
		int a = scn.nextInt();
		System.out.println("enter 2st number");
		int b = scn.nextInt();
		System.out.println("enter no of series");
		int n = scn.nextInt();
		System.out.print(a+" ");
		System.out.print(b+" ");
		for(int i=1;i<=n;i++)
		{
			int c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
	}

}
