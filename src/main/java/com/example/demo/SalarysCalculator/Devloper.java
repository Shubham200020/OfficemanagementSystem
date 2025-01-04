package com.example.demo.SalarysCalculator;

public class Devloper extends Salary implements SalaryInt{

	@Override
	public void addInstansive(float percentage) {
		// TODO Auto-generated method stub
		float salary=super.getSalary();
		 salary=(percentage*salary)/100;
		 salary=super.getSalary()+salary;
		 super.setSalary(salary);
		
		
	}
	@Override
	public void setSalary(float salary){
		float Annual=(18*salary)/100;
		 super.setSalary(salary);
		 
		super.setAnnual(salary+Annual*12);
	 }


}
