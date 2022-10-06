package com.yash.java8.assignment;

import java.util.Scanner;

public class Problem6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("## Printing the pattern ##");
        int alphabet=65;
        System.out.println("enter the number");
        Scanner sc=new Scanner(System.in);
      int input=  sc.nextInt();
        for(int i=0;i<= input;i++)
        {
            for(int j=0;j<=input-i;j++)
            {
                System.out.print((char)(alphabet+j));
            }
            for(int k=1;k<=i*2-1; k++)
            {
                System.out.print(" ");
            }
            for(int l=input-i; l>=0; l--)
            {
                if(l!=input)
                    System.out.print((char)(alphabet+l));
            }
           System.out.println();
        }

	}

}
