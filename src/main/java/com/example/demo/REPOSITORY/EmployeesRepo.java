package com.example.demo.REPOSITORY;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.POJO.Employee.Employees;

@Repository

public interface EmployeesRepo extends JpaRepository<Employees, String> {
	Optional<Employees> findById(String id);
	
	

}
