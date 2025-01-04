package com.example.demo.POJO.Task;

import java.util.List;
import java.util.Set;

import org.hibernate.annotations.GenericGenerator;

import com.example.demo.POJO.Employee.Employees;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;


@Embeddable
public class AssigmentTask {
	 @ManyToMany(cascade = CascadeType.ALL)
	    @JoinTable(
	        name = "moviestaks", // Name of the join table
	        joinColumns = @JoinColumn(name = "movie_id"), // Foreign key in join table for Movies
	        inverseJoinColumns = @JoinColumn(name = "comment_id") // Foreign key in join table for Actors
	    )
	
	 private Set<Employees> employees;

	public AssigmentTask() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AssigmentTask(Set<Employees> employees) {
		super();
		this.employees = employees;
	}

	public Set<Employees> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<Employees> employees) {
		this.employees = employees;
	}
	 

}
