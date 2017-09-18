package com.revature.pojo;

import java.sql.Blob;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "REIMBURSEMENT")
@Component
public class Reimbursement {

	@Id
	@Column(name = "R_ID")
	private int reimbursementId;
	
	@Column(name = "R_AUTHOR")
	private String author;
	
	@Column(name = "R_RESOLVER")
	private String resolver;
	
	@JoinColumn(name = "R_STATUS_ID")
	@ManyToOne
	private ReimbursementStatus reimbursementStatus;
	
	@JoinColumn(name = "R_TYPE_ID")
	@ManyToOne
	private ReimbursementType reimbursementType;
	
	@Column(name = "R_AMOUNT")
	private double amount;

	@Column(name = "R_SUBMITTED")
	private Timestamp submittedTime;
	
	@Column(name = "R_RESOLVED")
	private Timestamp resolvedTime;
	
	@Column(name = "R_RECEIPT")
	private Blob receipt;
	
	@Column(name = "R_DESCRIPTION")
	private String description;
	
	public Reimbursement(){
		
	}

	public Reimbursement(int reimbursementId, String author, String resolver, ReimbursementStatus reimbursementStatus,
			ReimbursementType reimbursementType, double amount, Timestamp submittedTime, Timestamp resolvedTime,
			Blob receipt, String description) {
		super();
		this.reimbursementId = reimbursementId;
		this.author = author;
		this.resolver = resolver;
		this.reimbursementStatus = reimbursementStatus;
		this.reimbursementType = reimbursementType;
		this.amount = amount;
		this.submittedTime = submittedTime;
		this.resolvedTime = resolvedTime;
		this.receipt = receipt;
		this.description = description;
	}

	public int getReimbursementId() {
		return reimbursementId;
	}

	public void setReimbursementId(int reimbursementId) {
		this.reimbursementId = reimbursementId;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getResolver() {
		return resolver;
	}

	public void setResolver(String resolver) {
		this.resolver = resolver;
	}

	public ReimbursementStatus getReimbursementStatus() {
		return reimbursementStatus;
	}

	public void setReimbursementStatus(ReimbursementStatus reimbursementStatus) {
		this.reimbursementStatus = reimbursementStatus;
	}

	public ReimbursementType getReimbursementType() {
		return reimbursementType;
	}

	public void setReimbursementType(ReimbursementType reimbursementType) {
		this.reimbursementType = reimbursementType;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Timestamp getSubmittedTime() {
		return submittedTime;
	}

	public void setSubmittedTime(Timestamp submittedTime) {
		this.submittedTime = submittedTime;
	}

	public Timestamp getResolvedTime() {
		return resolvedTime;
	}

	public void setResolvedTime(Timestamp resolvedTime) {
		this.resolvedTime = resolvedTime;
	}

	public Blob getReceipt() {
		return receipt;
	}

	public void setReceipt(Blob receipt) {
		this.receipt = receipt;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Reimbursement [reimbursementId=" + reimbursementId + ", author=" + author + ", resolver=" + resolver
				+ ", reimbursementStatus=" + reimbursementStatus + ", reimbursementType=" + reimbursementType
				+ ", amount=" + amount + ", submittedTime=" + submittedTime + ", resolvedTime=" + resolvedTime
				+ ", receipt=" + receipt + ", description=" + description + "]";
	}
	
}
