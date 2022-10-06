package com.yash.collection.assinment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Problem4 {
	public static ArrayList<String> removeDuplicates(ArrayList<String> list) {

		// Create a new ArrayList
		ArrayList<String> newList = new ArrayList<String>();

		// Traverse through the first list
		for (String element : list) {

			// If this element is not present in newList
			// then add it
			if (!newList.contains(element)) {

				newList.add(element);
			}
		}

		// return the new list
		return newList;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Get the ArrayList with duplicate values
		ArrayList<String> list = new ArrayList<>(Arrays.asList("deepesh", "lokesh", "hitesh", "deepesh"));

		// Print the Arraylist
		System.out.println("ArrayList with duplicates: " + list);

		// Remove duplicates
		ArrayList<String> newList = removeDuplicates(list);
		Collections.sort(newList);
		Collections.reverse(newList);

		// Print the ArrayList with duplicates removed
		System.out.println("ArrayList with duplicates removed: " + newList);

	}

}
