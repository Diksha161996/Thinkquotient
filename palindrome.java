package com.reversestring;

public class palindrome {

	public static void main(String[] args) {
	
		java.util.Scanner scn= new java.util.Scanner(System.in);	
		System.out.println("enter the number");
		int n = scn.nextInt();
		
			  int a=n;
			  int sum=0;    
			  
			  while(n>0)
			  {    
			 int r=n%10;  //getting remainder  
			   sum=(sum*10)+r;    
			   n=n/10;    
			  }    
			  if(sum==a)   
			  {
				
			   System.out.println(" number "+a+" is palindrome number ");    
			  }
			  else    
			  {
			   System.out.println(" number "+a+" not palindrome number ");    
			}  
			}  
	}
	


