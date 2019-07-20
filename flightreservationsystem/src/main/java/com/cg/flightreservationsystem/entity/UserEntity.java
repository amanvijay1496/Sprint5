package com.cg.flightreservationsystem.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_login")
public class UserEntity {

	@Id
	private String username;
	private String password;
	private int roleid;

	public UserEntity() {
	}

	public UserEntity(String username, String password, int roleid) {
		this.username = username;
		this.password = password;
		this.roleid = roleid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getRoleid() {
		return roleid;
	}

	public void setRoleid(int roleid) {
		this.roleid = roleid;
	}

	@Override
	public String toString() {
		return "UserEntity [username=" + username + ", password=" + password + ", roleid=" + roleid + "]";
	}

}
