package com.collection;

import java.util.Stack;


public class stackclass {

	public static void main(String[] args) {
		Stack  s=new Stack();
		s.add("1111");
		s.add("ddd");		
        s.add("sanvi");
        System.out.println(s);
        s.pop();
        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s.push("more"));
        System.out.println(s);
        
	}

}


	


