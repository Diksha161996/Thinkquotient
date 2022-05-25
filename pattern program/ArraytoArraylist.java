package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
public class ArraytoArraylist
 {
public static void  main(String[] args) 
{
String[]  my_array = new String[] {"diksha", "reshma", "sanvi",  "sonu", "sakshi", "aish"};
ArrayList<String>  list = new ArrayList<String>(Arrays.asList(my_array));

System.out.println(list);
}
}



	
