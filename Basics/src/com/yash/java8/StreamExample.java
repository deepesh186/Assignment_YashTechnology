package com.yash.java8;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

	public static void main(String[] args)
	{
		List<Integer> l1=Arrays.asList(1,2,3,4);
		
		List<Integer> l2=l1.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(l2);
	}
}
