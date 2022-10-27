package com.springboot.springbootcrudrestfulwebservices.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employees")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name = "empName")
	private String empName;
	
	
	
	
	public Employee(long id, String empName) {
		super();
		this.id = id;
		this.empName = empName;
	}
	
	
	public Employee() {
		super();
	}


	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", empName=" + empName + "]";
	}
	
	

}
