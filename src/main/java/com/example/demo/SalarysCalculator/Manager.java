package com.example.demo.SalarysCalculator;

import com.example.demo.POJO.Employee.Salary;

public class Manager extends Salary implements SalaryInt {

	@Override
	public void setSalary(float salary) {
		// TODO Auto-generated method stub
		super.setSalary(salary);
	}

	@Override
	public void addInstansive(float percentage) {
		
		
	}

}
