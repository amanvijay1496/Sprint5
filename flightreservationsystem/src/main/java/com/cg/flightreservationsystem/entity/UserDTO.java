package com.cg.flightreservationsystem.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

/**
 * User Entity Class with user name and password field
 * 
 * @author trainee
 *
 */
@Entity
@Table(name = "user_table")
public class UserDTO {
	@Id
	@NotEmpty(message = "Please provide a username")
	private String username;
	private String password;

	public UserDTO() {

	}

	/**
	 * 
	 * @param username
	 * @param password
	 */
	public UserDTO(String username, String password) {
		this.username = username;
		this.password = password;
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
		return "UserDTO [username=" + username + ", password=" + password + "]";
	}

	@Override
	public boolean equals(Object obj) {
		return this.getUsername().equals(((UserDTO) obj).getUsername());
	}

}
