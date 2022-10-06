package com.yash.spring.assingment.SpringAssingment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstrutorMessageMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		ConstrutorMessage e= (ConstrutorMessage) context.getBean("empci");
			System.out.println(e);
	}

}
