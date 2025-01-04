package com.example.demo.SalarysCalculator;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Salary  {
	@Column(name = "salary")
	private float salary;
	@Column(name = "annual")
	private float annual;

	public Salary(float salary, float annual) {
		super();
		this.salary = salary;
		this.annual = annual;
	}

	public Salary() {
		super();
		// TODO Auto-generated constructor stub
	}

	public float getAnnual() {
		return annual;
	}

	public void setAnnual(float annual) {
		this.annual = annual;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}



}
