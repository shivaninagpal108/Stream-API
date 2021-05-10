//map() is used if for every object we want to perform a operation and want some resultant objects
package com.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program2_AddingNumber 
{
	public static void main(String[] args)
	{
		ArrayList<Integer> l = new ArrayList<>();
		l.add(05);
		l.add(10);
		l.add(15);
		l.add(20);
		l.add(25);
		System.out.println(l);
		List<Integer> l2 = l.stream().map(i-> i+5).collect(Collectors.toList());
		System.out.println(l2);
	}

}
