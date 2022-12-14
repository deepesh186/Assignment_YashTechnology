package com.yash.oops.assinment;

class Number {
	int x = 3, y = 4;

	public int getCompare(int x, int y) {
		return 0;
	}
}

public class MaximumOfNumber extends Number {
	public int getCompare(int x, int y) {
		return ((x + y + Math.abs(x - y)) / 2);
	}

	public static void main(String args[]) {
		int x = 3, y = 4;
		MaximumOfNumber n = new MaximumOfNumber();

		// Displaying the maximum value
		System.out.println("Maximum: " + n.getCompare(x, y));
	}
}
