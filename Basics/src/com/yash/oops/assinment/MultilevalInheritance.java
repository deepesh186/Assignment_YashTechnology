package com.yash.oops.assinment;



abstract class CalcAbs{
	void sum(int a, int b) {
		System.out.println(a+b);
	}
	 void sub(int a, int b){
		System.out.println(a-b);
	}
	 void mul(int a, int b){
		System.out.println(a*b);
	}
	 void div(int a,int b){
		System.out.println(a/b);
	}
}

class A extends CalcAbs{
	void sum(int a, int b) {
		System.out.println(a+b);
	}
}

class B extends A{
	 void sub(int a, int b){
		System.out.println(a-b);
	}
}

class C extends B{
	 void mul(int a, int b){
		System.out.println("class C"+(a*b));
	}
}

public class MultilevalInheritance extends C{
	void div(int a,int b){
		System.out.println(a/b);
	}
   public static void main(String args[]) {
	   MultilevalInheritance d = new MultilevalInheritance();
	   d.div(10, 2);
       d.mul(1, 3);
       d.sub(3, 1);
       d.sum(2, 9);
	}
}