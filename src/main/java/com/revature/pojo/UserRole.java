package com.revature.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "U_ROLE")
@Component
public class UserRole {

	@Id
	@Column(name = "U_ROLE_ID")
	private int roleId;
	
	@Column(name = "U_ROLE")
	private String role;
	
	public UserRole(){
		
	}

	public int getRoleId() {
		return roleId;
	}

	public String getRole() {
		return role;
	}

	@Override
	public String toString() {
		return "UserRole [roleId=" + roleId + ", role=" + role + "]";
	}
	
}
