package com.ams.passenger.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="passengers")
public class Passenger {
	
	@Id
	public int profile_id;
	
	@Column
	public String firstName;
	
	@Column
	public String lastName;

	@Column
	public String address;
	
	@Column
	public String password;
	
	@Column
	public String mobile_numbe;
	
	@Column
	public String email_id;

	public int getProfile_id() {
		return profile_id;
	}

	public void setProfile_id(int profile_id) {
		this.profile_id = profile_id;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobile_numbe() {
		return mobile_numbe;
	}

	public void setMobile_numbe(String mobile_numbe) {
		this.mobile_numbe = mobile_numbe;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public Passenger(int profile_id, String firstName, String lastName, String address, String password,
			String mobile_numbe, String email_id) {
		super();
		this.profile_id = profile_id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.password = password;
		this.mobile_numbe = mobile_numbe;
		this.email_id = email_id;
	}
}
