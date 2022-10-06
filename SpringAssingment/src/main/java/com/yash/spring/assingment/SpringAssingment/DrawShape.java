package com.yash.spring.assingment.SpringAssingment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
	        Shape e=(Shape) context.getBean("rct");
	        
	          e.draw();
	         
	}

}
