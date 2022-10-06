package com.yash.spring.assingment.SpringAssingment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PrintMessageMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		PrintMessage e= (PrintMessage) context.getBean("message");
			System.out.println(e);

	}

}
