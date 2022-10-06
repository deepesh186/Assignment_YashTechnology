package com.yash.java8;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             MyInter i= (a, b)->{
            	  return a+b;
              };
              System.out.println(i.sum(2, 3));
              
             Message i1= ()->
             System.out.println("hello");
             i1.message();
		
	}

}
