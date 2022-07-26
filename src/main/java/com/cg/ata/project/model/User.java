package com.cg.ata.project.model;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;



@Entity
@Table(name = "user_table")
public class User {

	@Column(name = "name")
@NotBlank
	@Min(4)
	@Max(32)
	String name;

	@Id
	@NotNull
	@Column(name = "mobile")
	@Pattern(regexp = "^[0-9]{10}$", message = "Must be 10 digits")
	private long mobileNumber;

	@Pattern(regexp = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[a-zA-Z]).{8,}$")
	 private String password;

	@Column(name = "DOB")
	private Date dob;

	@Column(name = "Address")
	private String address;

	@Column(name = "Email")
	private String email;

	@Column(name = "Gender")
	private String gender;
	
	@Column(name = "role")
	private Role role;

	public User() {
		super();

	}

	public User(String name, @NotNull @Pattern(regexp = "^[0-9]{10}$", message = "Must be 10 digits") long mobileNumber, String password,Role role) {
		super();
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.password = password;
		this.role = role;

	}

	public User(String name, @NotNull @Pattern(regexp = "^[0-9]{10}$", message = "Must be 10 digits") long mobileNumber, String password, Date dob, String address, String email,
			String gender,Role role) {
		super();
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.password = password;
		this.dob = dob;
		this.address = address;
		this.email = email;
		this.gender = gender;
		this.role = role;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber (long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", mobileNumber=" + mobileNumber + ", password=" + password + ", dob=" + dob
				+ ", address=" + address + ", email=" + email + ", gender=" + gender + ",role=" + role + "]";
	}
	
}

