package com.cg.flightreservationsystem.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

@Entity
@Table(name = "admin")
public class AdminDTO {

	@Id
	@NotEmpty(message = "Please provide a username")
	@Pattern(regexp = "^[A-Za-z0-9]{3,15}$", message = "Not a valid username")
	private String username;
	private String password;
	
	public AdminDTO() {
		
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "AdminDTO [username=" + username + ", password=" + password + "]";
	}
	
}
