package com.collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetProgram2{

	public static void main(String[] args) {
	 Set s=new LinkedHashSet();
	 s.add(2345);
	 s.add(5678);
	 s.add("siiii");
	 s.add(7777);
	 s.add(null);
	 s.add(23);
       System.out.println(s);
	}

}

