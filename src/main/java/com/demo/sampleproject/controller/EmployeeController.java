package com.demo.sampleproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.sampleproject.entity.Employee;
import com.demo.sampleproject.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeservice;

	@PostMapping(value = "/saveemployee")
	public ResponseEntity<String> saveEmployee(@RequestBody Employee emp) {

		ResponseEntity<String> saveemp = employeeservice.saveEmployee(emp);
		return saveemp;
	}

	@GetMapping(value = "/getallemployee")
	public ResponseEntity<List<Employee>> getAllEmployee() {

		ResponseEntity<List<Employee>> getallemp = employeeservice.getAllEmployee();
		return getallemp;
	}
}
