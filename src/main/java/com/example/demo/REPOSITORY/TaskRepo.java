package com.example.demo.REPOSITORY;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.POJO.Task.Tasks;

@Repository
public interface TaskRepo extends JpaRepository<Tasks, String>{
	public Optional<Tasks> findById(String id);
}
