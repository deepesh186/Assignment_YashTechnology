package com.yash.oops.assinment;

class Product implements Cloneable
{
	 int pid=1;
	 String pname="LCD";
	 int price=2000;
	 int unitOfMeasurement=3;
	 public Object clone() throws CloneNotSupportedException
	    {
	        return super.clone();
	    }
	 public void getDetails()
	 {
		 System.out.println(pid+"  "+pname+"  "+price+"  "+unitOfMeasurement);
	 }
	 
	 
}

public class CloneExample {

	public static void main(String[] args) throws CloneNotSupportedException{
		// TODO Auto-generated method stub
		Product p1=new Product();
		p1.getDetails();
		Product t2 = (Product)p1.clone();
		t2.pname="DTH";
		t2.price=1000;
		System.out.println(t2.pid+"  "+t2.pname+"  "+t2.price+"  "+t2.unitOfMeasurement);
		
		System.out.println(t2 instanceof Product);

	}

}
