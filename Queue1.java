package com.collection;

import java.util.Queue;
import java.util.LinkedList;

public class Queue1 {

	public static void main(String[] args) {
		Queue q=new LinkedList();
		System.out.println(q.offer("Test1"));
		System.out.println(q.peek());
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q);

	}

}
