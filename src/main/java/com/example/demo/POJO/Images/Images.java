package com.example.demo.POJO.Images;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Table(name = "employees_images")
@Entity
public class Images {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "name")
	private String name;
	private String type;
	 @Column(name = "imgData",length = 494967295)
	 private byte[] imageData;
	public Images() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Images(Long id, String name, String type, byte[] imageData) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.imageData = imageData;
	}


	public byte[] getImageData() {
		return imageData;
	}


	public void setImageData(byte[] imageData) {
		this.imageData = imageData;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	

}
