package com.yash.java8.assignment;

import java.util.Scanner;

public class Problem3 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("chose any number form 1 to 4\n 1 for even\n2 for odd \n3 for amstrong\n4 for palindrom");
		int input=sc.nextInt();
	
		
		if(input==1)
		{
			System.out.println("enter number you wanna check ");
			int even=sc.nextInt();
		Even e1=(i)->
		{
			if(i%2==0)
				System.out.println("number is even");
			else
				System.out.println("numner is not even");
		};
		e1.checkEven(even);
		}
		
		
		if(input==2)
		{
			System.out.println("enter number you wanna check ");
			int odd=sc.nextInt();
		Odd e1=(i)->
		{
			if(i%2==0)
				System.out.println("number is not odd");
			else
				System.out.println("numner is odd");
		};
		e1.checkOdd(odd);;
		}
		
		if(input==3)
		{
			System.out.println("enter number you wanna check ");
			int ams=sc.nextInt();
		Amstrong e1=(i)->
		{int temp, digits=0, last=0, sum=0;   
		//assigning n into a temp variable  
		temp=i;   
		//loop execute until the condition becomes false  
		while(temp>0)    
		{   
		temp = temp/10;   
		digits++;   
		}   
		temp = i;   
		while(temp>0)   
		{   
		//determines the last digit from the number      
		last = temp % 10;   
		//calculates the power of a number up to digit times and add the resultant to the sum variable  
		sum +=  (Math.pow(last, digits));   
		//removes the last digit   
		temp = temp/10;   
		}  
		//compares the sum with n  
		if(i==sum)   
		//returns if sum and n are equal  
		System.out.println("number is amstrong");    
		//returns false if sum and n are not equal  
		else 
			System.out.println("number is amstrong");  
		};
		e1.amstrong(ams);
		}
		if(input==4)
		{
			System.out.println("enter number you wanna check ");
			String odd=sc.next();
		Palindrom e1=(str)->
		{
			String rev="";
	         for(int i=str.length()-1;i>=0;i--)
	        	 rev+=str.charAt(i);
	         
	         if(str.equals(rev))
	        	 System.out.println("given string is palindrom");
	         else
	        	 System.out.println("given string is not palindrom");
		};
		e1.isPalindrom(odd);
		}
		
	}

}
