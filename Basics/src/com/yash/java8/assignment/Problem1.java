package com.yash.java8.assignment;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string you wanna check palindrom");
		String str1=sc.next();
		
	Palindrom p=	(str)->
		{
			
			String rev="";
	         for(int i=str.length()-1;i>=0;i--)
	        	 rev+=str.charAt(i);
	         
	         if(str.equals(rev))
	        	 System.out.println("given string is palindrom");
	         else
	        	 System.out.println("given string is not palindrom");
			
		};
		p.isPalindrom(str1);
		
		
         
         
	}

}
