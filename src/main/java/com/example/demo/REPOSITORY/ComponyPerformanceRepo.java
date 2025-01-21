package com.example.demo.REPOSITORY;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.POJO.ComponyPerformnce;
@Repository
public interface ComponyPerformanceRepo extends JpaRepository<ComponyPerformnce, Integer> {

}
