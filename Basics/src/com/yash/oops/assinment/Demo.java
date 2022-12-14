package com.yash.oops.assinment;

import java.util.Arrays;

class Person {
	private int Pid;
	private String pname;
	private String paddress;
	private String dob;

	public int getPid() {
		return Pid;
	}

	public Person(int pid, String pname, String paddress, String dob) {
		super();
		Pid = pid;
		this.pname = pname;
		this.paddress = paddress;
		this.dob = dob;
	}

	public void setPid(int pid) {
		Pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPaddress() {
		return paddress;
	}

	public void setPaddress(String paddress) {
		this.paddress = paddress;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

}

class Employee extends Person {

	public Employee(int pid, String pname, String paddress, String dob, String date_of_joining, String base_location,
			String deptobj, String contactno, String emailid, String arr) {
		super(pid, pname, paddress, dob);
		this.date_of_joining = date_of_joining;
		this.base_location = base_location;
		this.deptobj = deptobj;
		this.contactno = contactno;
		this.emailid = emailid;
		this.arr = arr;
		System.out.println("employee class details are below:");
		System.out.println("personid=" + pid + " " + "person name" + " " + pname + "person address" + " " + paddress
				+ " " + "person dob" + dob + " " + "doj" + date_of_joining + " " + "Base location" + base_location + " "
				+ "Deptobj" + deptobj + " " + "contactno" + contactno + " " + "Email id" + emailid + " " + "dept data"
				+ arr);
	}

	@Override
	public String toString() {
		return "Employee [date_of_joining=" + date_of_joining + ", base_location=" + base_location + ", deptobj="
				+ deptobj + ", contactno=" + contactno + ", emailid=" + emailid + ", arr=" + arr + "]";
	}

	private String date_of_joining;
	private String base_location;
	private String deptobj;
	private String contactno;
	private String emailid;
	String arr;

	public String getArr() {
		return arr;
	}

	public void setArr(String arr) {
		this.arr = arr;
	}

	public String getDate_of_joining() {
		return date_of_joining;
	}

	public void setDate_of_joining(String date_of_joining) {
		this.date_of_joining = date_of_joining;
	}

	public String getBase_location() {
		return base_location;
	}

	public void setBase_location(String base_location) {
		this.base_location = base_location;
	}

	public String getDeptobj() {
		return deptobj;
	}

	public void setDeptobj(String deptobj) {
		this.deptobj = deptobj;
	}

	public String getContactno() {
		return contactno;
	}

	public void setContactno(String contactno) {
		this.contactno = contactno;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

}

class Department {
	private int deptid;
	private String dname;

	public Department(int deptid, String dname) {
		super();
		this.deptid = deptid;
		this.dname = dname;
		System.out.println("department id" + deptid + " " + "Department name" + dname);
	}

	@Override
	public String toString() {
		return "Department [deptid=" + deptid + ", dname=" + dname + "]";
	}

	public void show() {
		System.out.println("department id" + deptid + " " + "Department name" + dname);
	}

	public int getDeptid() {
		return deptid;
	}

	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

}

class Customer extends Person {
	private String date_of_registration;
	private String delivery_address;
	private int contactno;
	private String email_id;

	public Customer(int pid, String pname, String paddress, String dob, String date_of_registration,
			String delivery_address, int contactno, String email_id) {
		super(pid, pname, paddress, dob);
		this.date_of_registration = date_of_registration;
		this.delivery_address = delivery_address;
		this.contactno = contactno;
		this.email_id = email_id;
		System.out.println("Customer class details are:");
		System.out.println("personid=" + pid + " " + "person name" + " " + pname + "person address" + " " + paddress
				+ " " + "person dob" + dob + " " + "Date of resign " + date_of_registration + " " + "Delivery Address"
				+ delivery_address + " " + " contact no" + contactno + " " + " email id" + email_id);
	}

	public String getDate_of_registration() {
		return date_of_registration;
	}

	public void setDate_of_registration(String date_of_registration) {
		this.date_of_registration = date_of_registration;
	}

	public String getDelivery_address() {
		return delivery_address;
	}

	public void setDelivery_address(String delivery_address) {
		this.delivery_address = delivery_address;
	}

	public int getContactno() {
		return contactno;
	}

	public void setContactno(int contactno) {
		this.contactno = contactno;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

}

class Demo {
	public static void main(String args[]) {
		Department[] arr = new Department[2];
		arr[0] = new Department(12, "java");

		arr[1] = new Department(13, "dotnet");

		Employee e = new Employee(101, "Deepesh", "217 rajiv awas", "15-04-1993", "13-09-12", "indore", "java",
				"8435541458", "deepeshagrawal93@gmail.com", Arrays.toString(arr));
		Customer c = new Customer(101, "Deepesh", "217 rajiv awas", "15-04-1993", "12-02-12", "rajiv awas", 843554,
				"deepesh94@gmal.com");

	}
}
