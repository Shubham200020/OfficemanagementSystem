package com.example.demo.POJO.Attendance;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;
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
	private LocalDateTime  punchInDay;
	
	private LocalDateTime  punchOutDay;

	private PunchinStatus status;
	private int hours;
	private int minutes;
	@ManyToOne
	private Employees employees;
	public AttendanceManagementSystem() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AttendanceManagementSystem(Long id, LocalDateTime punchInDay, LocalDateTime punchOutDay,
			PunchinStatus status, int hours, int minutes, Employees employees) {
		super();
		this.id = id;
		this.punchInDay = punchInDay;
		this.punchOutDay = punchOutDay;
		this.status = status;
		this.hours = hours;
		this.minutes = minutes;
		this.employees = employees;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public LocalDateTime getPunchInDay() {
		return punchInDay;
	}
	public void setPunchInDay(LocalDateTime punchInDay) {
		this.punchInDay = punchInDay;
	}
	public LocalDateTime getPunchOutDay() {
		return punchOutDay;
	}
	public void setPunchOutDay(LocalDateTime punchOutDay) {
		this.punchOutDay = punchOutDay;
	}
	public PunchinStatus getStatus() {
		return status;
	}
	public void setStatus(PunchinStatus status) {
		this.status = status;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public int getMinutes() {
		return minutes;
	}
	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
	public Employees getEmployees() {
		return employees;
	}
	public void setEmployees(Employees employees) {
		this.employees = employees;
	}
	
	
}
