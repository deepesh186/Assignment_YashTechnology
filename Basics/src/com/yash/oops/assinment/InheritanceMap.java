package com.yash.oops.assinment;

class Electronics
{
	int id;
	String semiconductorType;
	String dateOfManufacturing;
	
	
	public void getCompare(int id,String semiconductorType,String dateOfManufacturing)
	{
		System.out.println("electronic class method");
		System.out.println(id+" "+semiconductorType+" "+dateOfManufacturing);
		
	}
	
}

class Mobile extends Electronics
{
	
	
	public void getCompare(int id,String semiconductorType,String dateOfManufacturing)
	{
		System.out.println("mobile class method");
		System.out.println(id+" "+semiconductorType+" "+dateOfManufacturing);
	}
	
}
 class Lcd extends Electronics
 {
	 public void getCompare(int id,String semiconductorType,String dateOfManufacturing)
		{
			System.out.println("LCD class method");
			System.out.println(id+" "+semiconductorType+" "+dateOfManufacturing);
		}
 }
 
 class Laptop extends Electronics
 {
	 public void getCompare(int id,String semiconductorType,String dateOfManufacturing)
		{
			System.out.println("laptop class method");
			System.out.println(id+" "+semiconductorType+" "+dateOfManufacturing);
		}
 }
public class InheritanceMap {
	
	public static void main(String args[]) 
	{
		Electronics e1=new Mobile();
		Electronics e2=new Lcd();
		Electronics e3=new Laptop();
		e1.getCompare(1,"mobile","22-09-2022");
		e2.getCompare(2, "LCD", "19-09-2022");
		e3.getCompare(3, "Laptop", "20-09-2022");
	}

}
