package com.example.demo.POJO.Employee;

import org.hibernate.annotations.GenericGenerator;

import com.example.demo.POJO.Attendance.PunchinStatus;
import com.example.demo.POJO.Images.Images;
import com.example.demo.SalarysCalculator.Salary;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
@Entity
@Table(name = "Employees")
public class Employees {
	@Id
	@GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
	@Column(name = "id")
	private String id;
	@Column(name = "name")
	private String name;
	@Column(name = "email",unique = true)
	private String email;
	@Column(length = 10,unique = true)
	private String phone;
	@Column(name = "role")
	private Role role;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	private Images images;

	public Employees() {
		super();
	}
	


	public Employees(String id, String name, String email, String phone, Role role, Images images) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.role = role;
	
		this.images = images;
	}



	public Images getImages() {
		return images;
	}



	public void setImages(Images images) {
		this.images = images;
	}


	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	
	
	

}
