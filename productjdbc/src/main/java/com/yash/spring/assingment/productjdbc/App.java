package com.yash.spring.assingment.productjdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.spring.assingment.productjdbc.dao.ProductDao;
import com.yash.spring.assingment.productjdbc.entities.Product;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "Hello World!" );
        ApplicationContext context=new ClassPathXmlApplicationContext("com/yash/spring/assingment/productjdbc/applicationcontext.xml");
        		ProductDao prodao=context.getBean("ProductDao",ProductDao.class);
        		Product p=new Product(); 
        		p.setProductId(100);
        		p.setProductName("laptop");
        		//int r=prodao.insert(p);//insert the details
        		int r=prodao.updatedetails(p);//update the details
        		//System.out.println(r + "Student added Successfully ");
        		//System.out.println(r + "Student details updated ");
        		//int r=prodao.deletedetails(101);//delete the details
//        		Product s=prodao.selectDetails(100);
//        		System.out.println(s);
        		List<Product> pro=prodao.getAllDetails();
       		for(Product p1:pro)
       		{
       			System.out.println(p1);
       		}
    }
}
