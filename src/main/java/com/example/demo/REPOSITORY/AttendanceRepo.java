package com.example.demo.REPOSITORY;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.POJO.Attendance.AttendanceManagementSystem;
import java.util.List;
import java.util.Optional;


@Repository
public interface AttendanceRepo extends JpaRepository<AttendanceManagementSystem, Long>{
	 Optional<AttendanceManagementSystem> findById(Long id);

}
