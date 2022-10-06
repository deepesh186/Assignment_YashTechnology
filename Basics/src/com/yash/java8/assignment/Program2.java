package com.yash.java8.assignment;

import java.util.Scanner;

@FunctionalInterface
interface MyInterface2{
	String isSubStringPresent(String str,String sub);
}

public class Program2 {
public static void main(String[] args) {
		
		MyInterface2 obj = (str,sub) ->{
			
			if(str.contains(sub)) {
				return "String is present";
			}else {
				return "String not found";
			}
		};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String str = sc.next();
		System.out.println("enter the substring");
		String sub = sc.next();
		
		System.out.println(obj.isSubStringPresent(str, sub));
		

	}
}
