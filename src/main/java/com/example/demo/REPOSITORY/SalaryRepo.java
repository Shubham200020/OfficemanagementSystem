package com.example.demo.REPOSITORY;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.POJO.Employee.Salary;
@Repository
public interface SalaryRepo extends JpaRepository<Salary, Integer>{

}
