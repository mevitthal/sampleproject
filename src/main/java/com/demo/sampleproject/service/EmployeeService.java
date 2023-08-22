package com.demo.sampleproject.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.demo.sampleproject.entity.Employee;

public interface EmployeeService {

	public ResponseEntity<String> saveEmployee(Employee emp);

	public ResponseEntity<List<Employee>> getAllEmployee();

}
