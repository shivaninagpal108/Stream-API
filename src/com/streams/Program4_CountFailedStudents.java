package com.streams;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Program4_CountFailedStudents 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> marks = new ArrayList<>();
		marks.add(30);
		marks.add(10);
		marks.add(15);
		marks.add(20);
		marks.add(35);
		marks.add(45);
		marks.add(5);
		System.out.println(marks);
		int countFailedStudents = (int) marks.stream().filter(m-> m<30).count();
		System.out.println("No. of failed students: "+countFailedStudents);
	}

}
