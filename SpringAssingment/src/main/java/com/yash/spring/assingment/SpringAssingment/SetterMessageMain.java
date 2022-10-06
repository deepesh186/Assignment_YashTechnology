package com.yash.spring.assingment.SpringAssingment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterMessageMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		SetterMessage e= (SetterMessage) context.getBean("message1");
			System.out.println(e);

	}

}
