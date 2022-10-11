package com.yash.spring.assingment.EmployeeSpringOrm.Dao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.yash.spring.assingment.EmployeeSpringOrm.entities.Employee;



public class EmployeeDao {
private HibernateTemplate hibernatetemp;
	
	@Transactional
	public int insert(Employee emp)
	{
		Integer i=(Integer)this.hibernatetemp.save(emp);
		return i;
		
	}
	public Employee getStudentDetails(int empid)
	{
		Employee stu=this.hibernatetemp.get(Employee.class, empid);
		return stu;
	}
	public List<Employee> getAllStudents()
	{
		List<Employee> stu=this.hibernatetemp.loadAll(Employee.class);
		return stu;
	}
	@Transactional
	public void deleteDetails(int empid)
	{
		Employee stu=this.hibernatetemp.get(Employee.class,empid);
		this.hibernatetemp.delete(stu);
	}
	@Transactional
	public void updateDetails(Employee emp)
	{
		this.hibernatetemp.update(emp);
	}
	public HibernateTemplate getHibernatetemp() {
		return hibernatetemp;
	}

	public void setHibernatetemp(HibernateTemplate hibernatetemp) {
		this.hibernatetemp = hibernatetemp;
	}

}
