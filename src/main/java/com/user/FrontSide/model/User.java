package com.user.FrontSide.model;

import java.util.List;

public class User {
	private Long userId;
	private String userName;
	private String password;
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	
	private boolean enable=true;
	
	private PrimaryAccount primaryAcc;
	
	private SavingsAccount privateAcc;
	
	private List<Appointment> listOfAppointment;
	
	private List<Recipient> listOfRecipient;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
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

	public boolean isEnable() {
		return enable;
	}

	public void setEnable(boolean enable) {
		this.enable = enable;
	}

	public PrimaryAccount getPrimaryAcc() {
		return primaryAcc;
	}

	public void setPrimaryAcc(PrimaryAccount primaryAcc) {
		this.primaryAcc = primaryAcc;
	}

	public SavingsAccount getPrivateAcc() {
		return privateAcc;
	}

	public void setPrivateAcc(SavingsAccount privateAcc) {
		this.privateAcc = privateAcc;
	}

	public List<Appointment> getListOfAppointment() {
		return listOfAppointment;
	}

	public void setListOfAppointment(List<Appointment> listOfAppointment) {
		this.listOfAppointment = listOfAppointment;
	}

	public List<Recipient> getListOfRecipient() {
		return listOfRecipient;
	}

	public void setListOfRecipient(List<Recipient> listOfRecipient) {
		this.listOfRecipient = listOfRecipient;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", password=" + password + ", firstName="
				+ firstName + ", lastName=" + lastName + ", email=" + email + ", phone=" + phone + ", enable=" + enable
				+ "]";
	}
	
	
	
	

}
