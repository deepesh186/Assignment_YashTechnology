package com.yash.collection.assinment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Problem3 {
	public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list) {

		// Create a new ArrayList
		ArrayList<Integer> newList = new ArrayList<Integer>();

		// Traverse through the first list
		for (Integer element : list) {

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
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 10, 1, 2, 2, 3, 3, 10, 3, 4, 5, 5));

		// Print the Arraylist
		System.out.println("ArrayList with duplicates: " + list);

		// Remove duplicates
		ArrayList<Integer> newList = removeDuplicates(list);
		Collections.sort(newList);

		// Print the ArrayList with duplicates removed
		System.out.println("ArrayList with duplicates removed: " + newList);

	}

}
