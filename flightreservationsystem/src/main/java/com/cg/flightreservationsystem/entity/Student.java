package com.cg.flightreservationsystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
	@Id
	private int id;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "email")
	private String email;

	public Student() {

	}

	public Student(int id, String firstName, String email) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getEmail() {
		return email;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", email=" + email + "]";
	}
}
