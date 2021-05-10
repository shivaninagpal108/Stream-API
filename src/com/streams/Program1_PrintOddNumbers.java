//filter() is used if we want to filter some objects based on some condition
package com.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program1_PrintOddNumbers 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> l = new ArrayList<>();
		l.add(05);
		l.add(10);
		l.add(15);
		l.add(20);
		l.add(25);
		l.add(30);
		l.add(35);
		l.add(40);
		System.out.println(l);
		List<Integer> l2 = l.stream().filter(i -> i%2!=0).collect(Collectors.toList());
		System.out.println(l2);
	}

}
