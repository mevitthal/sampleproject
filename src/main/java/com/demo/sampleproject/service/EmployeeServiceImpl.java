package com.demo.sampleproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.demo.sampleproject.dao.EmployeeDao;
import com.demo.sampleproject.entity.Employee;
import com.demo.sampleproject.exception.EmployeeNotFoundException;
import com.demo.sampleproject.exception.EmployeeNotSavedToDatabaseException;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeDao employeedao;

	@Override
	public ResponseEntity<String> saveEmployee(Employee emp) {
		
		

		Employee isSaved = employeedao.save(emp);

		if (isSaved == null) {
			throw new EmployeeNotSavedToDatabaseException();
		} else {
			return new ResponseEntity<String>("saved successful", HttpStatus.OK);
		}
	}

	@Override
	public ResponseEntity<List<Employee>> getAllEmployee() {
		List<Employee> listofemployee = employeedao.findAll();

		if (listofemployee.isEmpty()) {
			throw new EmployeeNotFoundException();
		} else {

			return new ResponseEntity<List<Employee>>(listofemployee, HttpStatus.OK);
		}

	}
}
