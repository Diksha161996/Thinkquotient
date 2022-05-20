package com.reversestring;

public class Strongnumber {

	public static void main(String[] args) {
		
		java.util.Scanner scn= new java.util.Scanner(System.in);	
		System.out.println("enter the number");
		int n = scn.nextInt();
		int a=n;
		int sum=0;
		while(n!=0)
		{
			int r=n%10;
			int i=1;
			int p=1;
			while(i<=r)
			{
				p=p*i;
				i++;
				
			}
			sum=sum+p;
			n/=10;
			
		}
		if (sum==a )
		{
			System.out.println("number "+a+" is strong number");
			
		}
		else
		{
			System.out.println("number "+a+" is  not strong number");
		}
	}

}
