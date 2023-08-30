package com.example.project.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "appliancemodel")
public class ApplianceModel {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "Customerid")
	private int CustomerId; 
	@Column(name = "Customername")
	private String customerName;
	@Column(name = "Place")
	private String place;
	@Column(name = "Mobileno")
	private int mobileNo;
	@OneToMany(mappedBy = "appliance", cascade = CascadeType.ALL)
    private List<RequestModel> requests;
	public int getCustomerId() {
		return CustomerId;
	}
	public void setCustomerId(int customerId) {
		CustomerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public int getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}
	public List<RequestModel> getRequests() {
		return requests;
	}
	public void setRequests(List<RequestModel> requests) {
		this.requests = requests;
	}
	
	
	

}
