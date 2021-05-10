package com.streams;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Program3_IncreaseMarksOfFailed 
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
		ArrayList<Integer> afterIncrement = (ArrayList<Integer>) marks.stream().filter(m-> m<=30).map(m -> m+10).collect(Collectors.toList());
		System.out.println("After adding 10 marks for students whose marks are less than or equal to 30");
		System.out.println(afterIncrement);
	}
}
