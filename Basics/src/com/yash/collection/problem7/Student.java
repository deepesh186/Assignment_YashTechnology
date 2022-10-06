package com.yash.collection.problem7;

import java.util.Scanner;



public class Student {

	
		// TODO Auto-generated method stub
		int rollno;
		 String sname, classname;
		 Double totalmarks; // marks out of 500, total five subjects each subject marks 100.
			
		 
		public int getRollno() {
			return rollno;
		}
		public void setRollno(int rollno) {
			this.rollno = rollno;
		}
		public String getSname() {
			return sname;
		}
		public void setSname(String sname) {
			this.sname = sname;
		}
		public String getClassname() {
			return classname;
		}
		public void setClassname(String classname) {
			this.classname = classname;
		}
		public Double getTotalmarks() {
			return totalmarks;
		}
		public void setTotalmarks(Double totalmarks) {
			this.totalmarks = totalmarks;
		}
		public Student(int rollno, String sname, String classname, Double totalmarks) {
			super();
			this.rollno = rollno;
			this.sname = sname;
			this.classname = classname;
			this.totalmarks = totalmarks;
		}
		@Override
		public String toString() {
			return "Student [rollno=" + rollno + ", sname=" + sname + ", classname=" + classname + ", totalmarks="
					+ totalmarks + "]";
		}
		

}
