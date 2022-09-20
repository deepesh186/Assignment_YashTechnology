package com.yash.array;

import java.util.Arrays;

public class DuplicateNumberInArray {
	 public static void main(String args[])
	    {
	        // Creating the array
	        int arr[] = {12, 22, 34, 22, 54, 6, 52, 8, 9, 34, 54, 68};
	        int freq[] = new int[arr.length];
	        // Sets all elements in the array to -1
	        Arrays.fill(freq, -1);
	        // Prints the array elements
	        System.out.println("The array elements are : "+Arrays.toString(arr));
	        
	        unique(arr,freq);
	    }
	    
	    // Function that counts the frequency of elements 
	    // and prints duplicate elements
	    static void unique(int arr[], int freq[])
	    {
	        int count;
	        for(int i = 0; i<arr.length; i++)
	        {
	            // Resets count to 1 after each element
	            count=1;
	            for(int j = i + 1; j<arr.length;j++)
	            {
	                // If another occurence of the current element is found 
	                // in the array then increments the counter
	                if(arr[i]==arr[j])
	                {
	                    count++;
	                    freq[j] = 0;
	                }
	            }
	            // Stores the frequency of each element
	            if(freq[i]!=0)
	            {
	                freq[i] = count;
	            }
	        }
	        // Prints the duplicate elements
	        System.out.print("The duplicate elements in the array are : ");
	        for(int i = 0; i<arr.length;i++)
	        {
	            if(freq[i]>1)
	                System.out.print(arr[i]+" ");
	        }
	    }
}
