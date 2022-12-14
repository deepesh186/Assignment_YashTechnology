package com.yash.string;

public final  class MyStringClass {
	static final int MAX_CHAR = 26;
	 public void getDescendingSortString(final String str)
	    {
	         
	        // Hash array to keep count of characters.
	        // Initially count of all charters is
	        // initialized to zero.
	       final int charCount[] = new int[MAX_CHAR];
	 
	        // Traverse string and increment
	        // count of characters
	        // 'a'-'a' will be 0, 'b'-'a' will be 1,
	        for (int i = 0; i < str.length(); i++)
	        {
	             
	            // so for location of character in count
	            // array we will do str[i]-'a'.
	            charCount[str.charAt(i) - 'a']++;
	        }
	 
	        // Traverse the hash array and print
	        // characters
	        for (int i = MAX_CHAR - 1; i >= 0; i--)
	        {
	            for (int j = 0; j < charCount[i]; j++)
	            {
	                System.out.print((char) ('a' + i));
	            }
	        }
	    }
	 
	

}
