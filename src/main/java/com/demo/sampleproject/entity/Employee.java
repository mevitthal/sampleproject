package com.demo.sampleproject.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Employee {
	@Id
	@SequenceGenerator(name = "my_entity_seq_gen", sequenceName = "MY_ENTITY_SEQ")
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "my_entity_seq_gen")
	private int id;
	private String empName;
	private String empSalary;

	public Employee() {
	}

	public int getId() {
		return id;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(String empSalary) {
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}

}
