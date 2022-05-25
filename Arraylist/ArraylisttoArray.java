package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
public class ArraylisttoArray 
 {
public static void  main(String[] args)
{
ArrayList<String> list = new ArrayList<String>();

list.add("diksha");

list.add("sanvi");

list.add("reshma");

list.add("aish");

list.add("neha");

list.add("sonu");

String[]  my_array = new String[list.size()];

list.toArray(my_array);

for (String  string : my_array)
{
System.out.println(string);
}
}
}


