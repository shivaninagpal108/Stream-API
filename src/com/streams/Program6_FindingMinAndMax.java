package com.streams;

import java.util.ArrayList;
public class Program6_FindingMinAndMax 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(5);
		al.add(50);
		al.add(25);
		al.add(15);
		al.add(30);
		System.out.println(al);
		int min = al.stream().min((i,j)->(i.compareTo(j))).get();
		int max = al.stream().max((i,j)->(i.compareTo(j))).get();
		System.out.println("Minimum element: "+min);
		System.out.println("Maximum element: "+max);
		min = al.stream().min((i,j)->(j.compareTo(i))).get();
		max = al.stream().max((i,j)->(j.compareTo(i))).get();
		System.out.println("Minimum element: "+min);
		System.out.println("Maximum element: "+max);
	}
}
