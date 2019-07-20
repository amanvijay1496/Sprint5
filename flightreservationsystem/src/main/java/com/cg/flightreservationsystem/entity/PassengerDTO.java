package com.cg.flightreservationsystem.entity;

public class PassengerDTO {

	private String name;
	private String age;
	private String mobileNo;
	private String emailId;
	public String getName() {
		return name;
	}
	public String getAge() {
		return age;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
}
