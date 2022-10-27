package com.yash.springboot.repositery;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.yash.springboot.model.Employee;
@Repository
public interface EmployeeRepositery extends JpaRepository<Employee, Long>{

}
