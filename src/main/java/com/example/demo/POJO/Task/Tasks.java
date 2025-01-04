package com.example.demo.POJO.Task;

import java.sql.Date;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Task")
public class Tasks {
	@Id
	@GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
	private String id;
	
	@Column(name = "task_name")
	private String taskName;
	@Column(name = "task_status")
	private TaskStatus taskStatus;
	@Embedded
	private AssigmentTask assigmentTask;
	@Column(name = "assing_date")
	private Date assingDate;
	@Column(name = "deadine")
	private Date deadLine;
	

	public Tasks(String id, String taskName, TaskStatus taskStatus, AssigmentTask assigmentTask, Date assingDate,
			Date deadLine) {
		super();
		this.id = id;
		this.taskName = taskName;
		this.taskStatus = taskStatus;
		this.assigmentTask = assigmentTask;
		this.assingDate = assingDate;
		this.deadLine = deadLine;
	}

	public Tasks() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getAssingDate() {
		return assingDate;
	}

	public void setAssingDate(Date assingDate) {
		this.assingDate = assingDate;
	}

	public Date getDeadLine() {
		return deadLine;
	}

	public void setDeadLine(Date deadLine) {
		this.deadLine = deadLine;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public TaskStatus getTaskStatus() {
		return taskStatus;
	}

	public void setTaskStatus(TaskStatus taskStatus) {
		this.taskStatus = taskStatus;
	}

	public AssigmentTask getAssigmentTask() {
		return assigmentTask;
	}

	public void setAssigmentTask(AssigmentTask assigmentTask) {
		this.assigmentTask = assigmentTask;
	}
	
}
