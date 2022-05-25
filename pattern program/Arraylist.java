package com.collection;

import java.util.ArrayList;
import java.util.List;

public class Arraylist 
{
	public static void main(String[] args)
	{
		List<Integer>lst=new ArrayList<Integer>();
		lst.add(222);
		lst.add(666);
		
		lst.add(7777);
		
for(Integer integer :lst)
{
	System.out.println(integer);
}
	}
}

