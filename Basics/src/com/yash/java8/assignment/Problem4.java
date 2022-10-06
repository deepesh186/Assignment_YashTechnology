package com.yash.java8.assignment;

import java.util.Scanner;

public class Problem4 {
	
	  public static void main(String[] args)
	    {
	  
	        // Get the Strings
		  System.out.println("enter original string");
		  Scanner sc=new Scanner(System.in);
	        String originalString = sc.next();
	        System.out.println("enter  string to be inserted");
	        String stringToBeInserted = sc.next();
	        System.out.println("enter the index where need to be inserted");
	        int index = sc.nextInt();
	  
	        System.out.println("Original String: "
	                           + originalString);
	        System.out.println("String to be inserted: "
	                           + stringToBeInserted);
	        System.out.println("String to be inserted at index: "
	                           + index);
	        
	        StringIntoString s=(originalString1,
		        stringToBeInserted1,
		        index1)->
	        {
	        	String newString = new String();
	        	  
	            for (int i = 0; i < originalString.length(); i++) {
	      
	                // Insert the original string character
	                // into the new string
	                newString += originalString.charAt(i);
	      
	                if (i == index) {
	      
	                    // Insert the string to be inserted
	                    // into the new string
	                    newString += stringToBeInserted;
	                }
	            }
	      
	            // return the modified String
	            System.out.println(newString);
	        	
	        };
	        s.insertString(originalString, stringToBeInserted, index);
	    }

}
