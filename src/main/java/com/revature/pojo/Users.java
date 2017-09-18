package com.revature.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "USERS")
@Component
public class Users {

	@Id
	@Column(name = "U_ID")
	private int id;
	
	@JoinColumn(name = "U_ROLE_ID")
	@ManyToOne
	private UserRole userRole;
	
	@Column(name = "U_EMAIL")
	private String email;
	
	@Column(name = "U_PASSWORD")
	private String password;
	
	@Column(name = "U_FNAME")
	private String firstName;
	
	@Column(name = "U_LNAME")
	private String lastName;
	
	public Users(){
		
	}

	public Users(int id, UserRole userRole, String email, String password, String firstName, String lastName) {
		super();
		this.id = id;
		this.userRole = userRole;
		this.email = email;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public UserRole getUserRole() {
		return userRole;
	}

	public void setUserRole(UserRole userRole) {
		this.userRole = userRole;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	@Override
	public String toString() {
		return "Users [id=" + id + ", userRole=" + userRole + ", email=" + email + ", password=" + password
				+ ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
}
