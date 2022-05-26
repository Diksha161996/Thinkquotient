package com.collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetprogram {

	public static void main(String[] args) {
		SortedSet s=new TreeSet();
		s.add(22);
		s.add(36);
		s.add(52);
		s.add(78);
		s.add(99);
		
		System.out.println(s);
		System.out.println(s.headSet(36));
        System.out.println(s.subSet(36,99));
	}

}
