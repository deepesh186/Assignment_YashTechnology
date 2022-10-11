package com.yash.spring.assingment.EmployeeSpringOrm.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EmployeeTable")
public class Employee {
	@Id
private int employeeId;
private String employeeName;


public Employee() {
	super();
}
public int getEmployeeId() {
	return employeeId;
}
public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
}
public String getEmployeeName() {
	return employeeName;
}
public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}
@Override
public String toString() {
	return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + "]";
}
public Employee(int employeeId, String employeeName) {
	super();
	this.employeeId = employeeId;
	this.employeeName = employeeName;
}

}
