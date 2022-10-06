package com.yash.spring.assingment.SpringAssingment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("Welcome to Spring First Application");
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
	Employee e= (Employee) context.getBean("employee");
		System.out.println(e);
    }
}
