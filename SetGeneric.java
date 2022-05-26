package com.collection;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class SetGeneric {

	public static void main(String[] args) {
       Set<Integer> s=new HashSet<Integer>();
        s.add(3);
        s.add(4);
        s.add(97);
        s.add(64);
        s.add(12);
        s.add(54);
        s.add(null);
        System.out.println(s);
           Iterator itr=s.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());

	}
	}
}
