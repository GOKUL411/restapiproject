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
@Table(name="productmodel")
public class ProductModel {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	@Column(name = "Apllianceid")
	private int  applianceId;
	@Column(name = "Aplliancetype")
	private String applianceType;
	@Column(name = "Brand")
	private String brand1;
	@Column(name = "Serialno")
	private int serialNo;
	@ManyToOne
	@JoinColumn(name = "customer_id")
	private ApplianceModel appliance;
	public int getApplianceId() {
		return applianceId;
	}
	public void setApplianceId(int applianceId) {
		this.applianceId = applianceId;
	}
	public String getApplianceType() {
		return applianceType;
	}
	public void setApplianceType(String applianceType) {
		this.applianceType = applianceType;
	}
	public String getBrand1() {
		return brand1;
	}
	public void setBrand1(String brand1) {
		this.brand1 = brand1;
	}
	public int getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(int serialNo) {
		this.serialNo = serialNo;
	}
	public ApplianceModel getAppliance() {
		return appliance;
	}
	public void setAppliance(ApplianceModel appliance) {
		this.appliance = appliance;
	}
	
	
	
}
