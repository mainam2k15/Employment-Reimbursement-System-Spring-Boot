package com.revature.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "R_STATUS")
@Component
public class ReimbursementStatus {

	@Id
	@Column(name = "R_STATUS_ID")
	private int statusId;
	
	@Column(name = "R_STATUS")
	private String status;
	
	public ReimbursementStatus(){
		
	}

	public int getStatusId() {
		return statusId;
	}

	public String getStatus() {
		return status;
	}

	@Override
	public String toString() {
		return "ReimbursementStatus [statusId=" + statusId + ", status=" + status + "]";
	}
	
}
