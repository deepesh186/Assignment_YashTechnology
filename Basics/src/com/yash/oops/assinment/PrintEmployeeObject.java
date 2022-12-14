package com.yash.oops.assinment;

import java.util.Date;

class Employee1 {
	int empid;

	String empname;
	int empsalary;
	String empaddress;
	Date emp_dob;

	Date emp_doj;

	public Employee1(int empid, String empname, int empsalary, String empaddress, Date emp_dob, Date emp_doj) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empsalary = empsalary;
		this.empaddress = empaddress;
		this.emp_dob = emp_dob;
		this.emp_doj = emp_doj;
	}

	@Override
	public String toString() {
		return "Employee1 [empid=" + empid + ", empname=" + empname + ", empsalary=" + empsalary + ", empaddress="
				+ empaddress + ", emp_dob=" + emp_dob + ", emp_doj=" + emp_doj + "]";
	}

}

public class PrintEmployeeObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("deprecation")
		Employee1 e = new Employee1(101, "deepesh", 101, "212 raj", new Date(120, 11, 18), new Date(122, 11, 18));
		System.out.println(e.toString());
	}

}
