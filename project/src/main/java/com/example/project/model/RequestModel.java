package com.example.project.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
@Entity
@Table(name="requestmodel")
public class RequestModel {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	@Column(name = "Requestid")
	private int requestId;
	@ManyToOne
	@JoinColumn(name = "appliance_Id")
	private ApplianceModel appliance;
	@Column(name = "Requestdate")
	private int requestDate;
	@Column(name = "Description")
	private String description;
	@Column(name = "status")
	private String Status;
	public int getRequestId() {
		return requestId;
	}
	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}
	public ApplianceModel getAppliance() {
		return appliance;
	}
	public void setAppliance(ApplianceModel appliance) {
		this.appliance = appliance;
	}
	public int getRequestDate() {
		return requestDate;
	}
	public void setRequestDate(int requestDate) {
		this.requestDate = requestDate;
	}
	public String getdescription() {
		return description;
	}
	public void setdescription(String description) {
		this.description = description;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	

}
