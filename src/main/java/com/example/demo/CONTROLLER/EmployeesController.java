package com.example.demo.CONTROLLER;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.POJO.Employee.Employees;
import com.example.demo.SERVICE.EmployeesService;

@RestController
@RequestMapping("/employees")
public class EmployeesController {
	@Autowired
	private EmployeesService employeesService;
	@PostMapping
	public ResponseEntity<Employees> postData(@RequestBody Employees emp) {
		return employeesService.saveEmployee(emp);
		
	}
	@GetMapping
	public ResponseEntity<List<Employees>> getData(){
		return employeesService.getEmployees();
	}
	@GetMapping("/data")
	public String getString(){
		return "Hello";
	}

}
