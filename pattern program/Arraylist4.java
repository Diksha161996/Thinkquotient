package com.collection;

import java.util.ArrayList;
import java.util.List;
public class Arraylist4 
{

	public static void main(String[] args)
	{
	List<Book> lst=new ArrayList<Book>();
	Book b1= new Book("devid","testing",500.33);
	Book b2= new Book("c","john",900.50);
	Book b3= new Book("c++","tom",1000.12);
	lst.add(b1);
	lst.add(b2);
	lst.add(b3);
	
	for(Book b:lst)
	{
		System.out.println("Author:-"+b.author+",Title:-"+b.title+",price:-Rs."+b.price);
	}
	}
   }


 class Book
 {
	 String author;
	 String title;
	 double price;
	 
	 public Book(String author,String title,double price)
	 {
	 this.author=author;
	 this.title=title;
	 this.price=price;
 }
 }