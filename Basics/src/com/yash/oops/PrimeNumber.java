package com.yash.oops;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,flag=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		num=sc.nextInt();
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				System.out.println("number is not prime");
			flag=1;
			break;
			}
		}
	if(flag==0)
		System.out.println("number is prime");
		

	}

}
