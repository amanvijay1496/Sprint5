package com.cg.flightreservationsystem.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "login_detail")
public class LoginEntity {

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "lid")
	@SequenceGenerator(name = "lid", sequenceName = "lid", initialValue = 1, allocationSize = 1)
	private int id;
	private String username;
	@Column(name = "intime")
	private Date inTime;
	@Column(name = "outime")
	private Date outTime;

	public LoginEntity() {

	}

	public LoginEntity(int id, String username, Date inTime, Date outTime) {

		this.id = id;
		this.username = username;
		this.inTime = inTime;
		this.outTime = outTime;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Date getInTime() {
		return inTime;
	}

	public void setInTime(Date inTime) {
		this.inTime = inTime;
	}

	public Date getOutTime() {
		return outTime;
	}

	public void setOutTime(Date outTime) {
		this.outTime = outTime;
	}

	@Override
	public String toString() {
		return "LoginEntity [id=" + id + ", username=" + username + ", inTime=" + inTime + ", outTime=" + outTime + "]";
	}

}
