package com.example.demo.SERVICE;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.POJO.Employee.Employees;
import com.example.demo.POJO.Employee.Role;
import com.example.demo.REPOSITORY.EmployeesRepo;
import com.example.demo.SalarysCalculator.Devloper;
import com.example.demo.SalarysCalculator.Salary;
import com.example.demo.SalarysCalculator.SalaryInt;

@Service
public class EmployeesService {
	@Autowired
	private EmployeesRepo employeesRepo;
	public ResponseEntity<List<Employees>> getEmployees(){
		return new ResponseEntity<List<Employees>>(employeesRepo.findAll(),HttpStatus.OK);
	}
	public ResponseEntity<Employees> saveEmployee(Employees emp) {
	
		return new ResponseEntity<Employees>(employeesRepo.save(emp),HttpStatus.ACCEPTED);
	}
	public ResponseEntity<Employees>getEmployeeById(String id){
		Employees emp=null;
		try {
		emp=employeesRepo.findById(id).get();
		return new ResponseEntity<Employees>(emp,HttpStatus.OK);
		}
		catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<Employees>(emp,HttpStatus.BAD_REQUEST);
		}
		
	}
	public ResponseEntity<Employees> delete(Employees emp){
		Employees em=null;
		try {
			employeesRepo.delete(em);
			return new ResponseEntity<Employees>(emp,HttpStatus.OK);
		}
		catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<Employees>(em,HttpStatus.BAD_REQUEST);
		}
	}

}
