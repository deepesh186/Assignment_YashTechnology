package com.yash.oops.assinment;

import com.yash.string.GarbageCollector;

public class FinalizeAssingment {
	
	String obj_name;
	static int count = 0;

	public FinalizeAssingment(String obj_name) {
		this.obj_name = obj_name;
		++count;
	}

	static void show() {
		// object t1 inside method becomes unreachable when show() removed
		FinalizeAssingment t1 = new FinalizeAssingment("t1");
		display();

	}

	static void display() {
		// object t2 inside method becomes unreachable when display() removed
		FinalizeAssingment t2 = new FinalizeAssingment("t2");
	}

	// Driver method
	public static void main(String args[]) {
		// calling show()
		show();

		// calling garbage collector
		System.gc();
	}

	@Override
	/*
	 * Overriding finalize method to check which object is garbage collected
	 */
	protected void finalize() throws Throwable {
		// will print name of object
		System.out.println(this.obj_name + " successfully garbage collected  " + "hashcode of object is" + "  "
				+ this.obj_name.hashCode());
		System.out.println("object are present in class" + " " + FinalizeAssingment.count);
	}
}
