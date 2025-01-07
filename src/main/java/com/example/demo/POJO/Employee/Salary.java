package com.example.demo.POJO.Employee;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "salary")
public class Salary {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private float salary;
	private float annualSalary;
	@OneToOne
	private Employees employees;
	public Salary() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Salary(int id, float salary, float annualSalary, Employees employees) {
		super();
		this.id = id;
		this.salary = salary;
		this.annualSalary = annualSalary;
		this.employees = employees;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public Employees getEmployees() {
		return employees;
	}
	public void setEmployees(Employees employees) {
		this.employees = employees;
	}

	public float getAnnualSalary() {
		return annualSalary;
	}

	public void setAnnualSalary(float annualSalary) {
		this.annualSalary = annualSalary;
	}
	
}
