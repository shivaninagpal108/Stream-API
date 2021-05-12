//sorted -> sorts according to default natural sorting order i.e. Comparable interface compareTo method
//sorted(Comparator) -> sorts according to customized sorting order i.e. Comparator interface compare method
package com.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program5_SortingList 
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
		System.out.println("Before Sorting: "+marks);
		List<Integer> ascMarks= marks.stream().sorted().collect(Collectors.toList());
		System.out.println("After Sorting in ascending order(default natural sorting for Integer class): "+ascMarks);
		List<Integer> descMarks= marks.stream().sorted((a,b)->b-a).collect(Collectors.toList());
		System.out.println("After Sorting in descending order(customised sorting for Integer class): "+descMarks);
		descMarks = marks.stream().sorted((a,b)->(a<b)?1:(a>b)?-1:0).collect(Collectors.toList());
		System.out.println("After Sorting in descending order(customised sorting for Integer class): "+descMarks);
		ArrayList<String> name = new ArrayList<>();
		name.add("Shivani");
		name.add("Manisha");
		name.add("Yachana");
		name.add("Sagar");
		name.add("Anushka");
		System.out.println("Before Sorting: "+name);
		List<String> ascName= name.stream().sorted().collect(Collectors.toList());
		System.out.println("After Sorting in ascending order(default natural sorting for String class): "+ascName);
		List<String> descName= name.stream().sorted((a,b)->b.compareTo(a)).collect(Collectors.toList());
		System.out.println("After Sorting in descending order(customised sorting for String class): "+descName);
	}
}
