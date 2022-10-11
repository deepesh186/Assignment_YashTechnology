package com.yash.spring.assingment.EmployeeSpringOrm;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.spring.assingment.EmployeeSpringOrm.Dao.EmployeeDao;
import com.yash.spring.assingment.EmployeeSpringOrm.entities.Employee;


/**
 * Hello world!
 *
 */
public class App 
{
    private static List<Employee> allStudents;

	public static void main( String[] args )
    {
    	 System.out.println( "Hello World!" );
         ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
         EmployeeDao studao=context.getBean("employeeDao",EmployeeDao.class);
         Employee emp=new Employee(1,"Deepesh");
        // int msg=studao.insert(emp);
        // System.out.println(msg + "insertion done");
         //studao.deleteDetails(1);
      //   allStudents = studao.getAllStudents();
       //  for(Employee e:allStudents)
        //	 System.out.println(e);
         emp.setEmployeeId(1);
         emp.setEmployeeName("lokesh");
         studao.updateDetails(emp);
    }
}
