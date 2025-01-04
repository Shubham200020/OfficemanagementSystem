package com.example.demo.POJO.Employee;
import com.example.demo.POJO.Attendance.PunchinStatus;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
@Entity
@Table(name = "performancetrack")
public class PerformanceTrack {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@OneToOne
	private Employees employees;
	@Column(name = "number_of_complite_task")
	private int compliteTasks;
	@Column(name = "number_of_painding_task")
	private int paindingTask;
	@Column(name = "number_of_reassigned_task")
	private int reassignedTask;
	private PunchinStatus status;
	public PerformanceTrack() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public PerformanceTrack(Long id, Employees employees, int compliteTasks, int paindingTask, int reassignedTask,
			PunchinStatus status) {
		super();
		this.id = id;
		this.employees = employees;
		this.compliteTasks = compliteTasks;
		this.paindingTask = paindingTask;
		this.reassignedTask = reassignedTask;
		this.status = status;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public int getCompliteTasks() {
		return compliteTasks;
	}

	public void setCompliteTasks(int compliteTasks) {
		this.compliteTasks = compliteTasks;
	}

	public int getPaindingTask() {
		return paindingTask;
	}

	public void setPaindingTask(int paindingTask) {
		this.paindingTask = paindingTask;
	}

	public int getReassignedTask() {
		return reassignedTask;
	}

	public void setReassignedTask(int reassignedTask) {
		this.reassignedTask = reassignedTask;
	}
	
}
