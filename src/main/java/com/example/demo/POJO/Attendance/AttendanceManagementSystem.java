package com.example.demo.POJO.Attendance;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;

import com.example.demo.POJO.Employee.Employees;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "attendace")
public class AttendanceManagementSystem {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private LocalDate  punchInDay;
	private LocalTime punchInTime;
	private LocalDate  punchOutDay;
	private LocalTime punchOutTime;
	private PunchinStatus status;
	@ManyToOne
	private Employees employees;
	public AttendanceManagementSystem() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public AttendanceManagementSystem(Long id, LocalDate punchInDay, LocalTime punchInTime, LocalDate punchOutDay,
			LocalTime punchOutTime, PunchinStatus status, Employees employees) {
		super();
		this.id = id;
		this.punchInDay = punchInDay;
		this.punchInTime = punchInTime;
		this.punchOutDay = punchOutDay;
		this.punchOutTime = punchOutTime;
		this.status = status;
		this.employees = employees;
	}

	public LocalDate getPunchOutDay() {
		return punchOutDay;
	}

	public void setPunchOutDay(LocalDate punchOutDay) {
		this.punchOutDay = punchOutDay;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public LocalDate getPunchInDay() {
		return punchInDay;
	}
	public void setPunchInDay(LocalDate punchInDay) {
		this.punchInDay = punchInDay;
	}
	public LocalTime getPunchInTime() {
		return punchInTime;
	}
	public void setPunchInTime(LocalTime punchInTime) {
		this.punchInTime = punchInTime;
	}
	public LocalTime getPunchOutTime() {
		return punchOutTime;
	}
	public void setPunchOutTime(LocalTime punchOutTime) {
		this.punchOutTime = punchOutTime;
	}
	public PunchinStatus getStatus() {
		return status;
	}
	public void setStatus(PunchinStatus status) {
		this.status = status;
	}
	public Employees getEmployees() {
		return employees;
	}
	public void setEmployees(Employees employees) {
		this.employees = employees;
	}
	
	
}
