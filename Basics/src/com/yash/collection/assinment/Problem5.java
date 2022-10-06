package com.yash.collection.assinment;

import java.util.Collections;
import java.util.Vector;

public class Problem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> vec=new Vector<String>();
		vec.add("deepesh");
		vec.add("lokesh");
		vec.add("hitesh");
		vec.add("deepesh");
		Collections.sort(vec);
		System.out.println(vec);

	}

}
