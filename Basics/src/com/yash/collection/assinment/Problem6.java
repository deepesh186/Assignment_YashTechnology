package com.yash.collection.assinment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Problem6 {
	 static Map<String, Integer> map = new HashMap<>();
	 public static void sortbykey()
	    {
	        ArrayList<String> sortedKeys
	            = new ArrayList<String>(map.keySet());
	 
	        Collections.sort(sortedKeys);
	 
	        // Display the TreeMap which is naturally sorted
	        for (String x : sortedKeys)
	            System.out.println("Key = " + x
	                               + ", Value = " + map.get(x));
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		map.put("mumbai", 50000);
		map.put("indore", 45000);
		map.put("banglore", 80000);
		map.put("chennai", 56000);
		map.put("dehli", 65000);
		
		sortbykey();

	}

}
