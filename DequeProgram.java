package com.collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class DequeProgram {

	public static void main(String[] args) {
		
		Deque d=new ArrayDeque();
		d.add(3);
		d.add(5);
		d.add(9);
		d.add(56);
		d.add(33);
		d.add(52);
		
		System.out.println(d);
		System.out.println(d.getLast());
		System.out.println(d.getFirst());
		System.out.println(d.removeFirst());
		Iterator itr=d.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		
	}
}
	}

