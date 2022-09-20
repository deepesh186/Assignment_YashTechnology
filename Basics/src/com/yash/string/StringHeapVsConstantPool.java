package com.yash.string;

public class StringHeapVsConstantPool {
	public static void main(String args[])
	{
	String a = "Deepesh";
	String b = "Deepesh";

	System.out.println(a==b);

	String c = new String("Deepesh");

	System.out.println(a == b);     //true
	System.out.println(b==c);     //false
	}

}
