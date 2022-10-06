package com.yash.exception;

import java.util.Scanner;

public class IndexTest {


	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		 String fName[] = {"deep","lokesh","pr","az","neha","aasih","re","ra","bhu","ay11"};
		 System.out.println("Enter the Index");
		 try {
			 int index = sc.nextInt();
			 System.out.println(fName[index]);
		 }catch(ArrayIndexOutOfBoundsException e) {
			 System.out.println(e);
		 }
	}

}
