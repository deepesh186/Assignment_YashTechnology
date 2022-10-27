package com.yash.springboot.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yash.springboot.exception.ResourceNotFoundException;
import com.yash.springboot.model.Employee;
import com.yash.springboot.repositery.EmployeeRepositery;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin("http://localhost:4200")
public class EmployeeController {
	@Autowired
	private EmployeeRepositery employeeRepositery;
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployees()
	{
		return employeeRepositery.findAll();
	}
	
	@PostMapping("/employees")
	public Employee createEmployee(@RequestBody Employee emp)
	{
		return employeeRepositery.save(emp);
	}

	@GetMapping("/employees/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id)
	{
		Employee emp=employeeRepositery.findById(id)
				.orElseThrow(()->new ResourceNotFoundException("Employee not found with id"+id));
		return ResponseEntity.ok(emp);
		
	}
	
	@PutMapping("/employees/{id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable Long id,@RequestBody Employee employeeDetails)
	{
		Employee emp=employeeRepositery.findById(id)
				.orElseThrow(()->new ResourceNotFoundException("Employee not found with id"+id));
		emp.setFirstName(employeeDetails.getFirstName());
		emp.setLastName(employeeDetails.getLastName());
		emp.setEmailId(employeeDetails.getEmailId());
		Employee updatedEmployee=employeeRepositery.save(emp);
		return ResponseEntity.ok(updatedEmployee);
		
	}
	@DeleteMapping("/employees/{id}")
	public ResponseEntity<Map<String,Boolean>> deleteEmployee(@PathVariable Long id)
	{
		Employee emp=employeeRepositery.findById(id)
				.orElseThrow(()->new ResourceNotFoundException("Employee not found with id"+id));
		employeeRepositery.delete(emp);
		Map<String,Boolean> response=new HashMap<String,Boolean>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
}
