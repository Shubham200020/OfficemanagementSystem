package com.example.demo.REPOSITORY;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.POJO.Employee.Employees;
import com.example.demo.POJO.Employee.PerformanceTrack;

@Repository
public interface PerformanceTrakingRepo extends JpaRepository<PerformanceTrack, Long>{
	PerformanceTrack findById(long id);
	

	PerformanceTrack findByEmployees(Employees emp);
}
