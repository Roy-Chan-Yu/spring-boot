package com.pouchen.roy.springboot.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.annotations.BatchSize;

@Entity
@Table(name = "spring_boot_student")
public class Student {
	
	@Id
	@Column
	private int id;
	@Column
	@Size(min=5, message="Name should have at least 5 characters")
	private String name;
	@Column
	private int age;
	@Column
	private String email;
	
	public int getId() {
		return id;
		
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
