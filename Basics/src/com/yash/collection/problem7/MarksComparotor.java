package com.yash.collection.problem7;

import java.util.Comparator;

public class MarksComparotor implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		if(o1.totalmarks==o2.totalmarks)
		return 0;
		else if(o1.totalmarks>o2.totalmarks)
			return 1;
		else
			return -1;
	}
	

}
