package com.collection;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Arraylist5 {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.add("ssss");
		v.add(4444);
		v.add("kkkk");
		System.out.println(v);
		
		Vector v1=new Vector(v);
		//System.out.println(v1);
 v1.add("rrrr");
 v1.add("nnnn");
 System.out.println(v1);
 
   Iterator itr=v1.iterator();
    while(itr.hasNext())
    {
    	System.out.println(itr.next());
    }
	}

}
