package com.revature.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "R_TYPE")
@Component
public class ReimbursementType {

	@Id
	@Column(name = "R_TYPE_ID")
	private int typeId;
	
	@Column(name = "R_TYPE")
	private String type;
	
	public ReimbursementType(){
		
	}

	public int getTypeId() {
		return typeId;
	}

	public String getType() {
		return type;
	}

	@Override
	public String toString() {
		return "ReimbursementType [typeId=" + typeId + ", type=" + type + "]";
	}
	
}
