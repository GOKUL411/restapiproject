package com.example.project.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "technicianmodel")
public class TechnicianModel {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	private int TechnicianId; 
	@Column(name = "Servicername")
	private String Name;
	@Column(name = "Specialization")
	private String specialist;
	public int getTechnicianId() {
		return TechnicianId;
	}
	public void setTechnicianId(int technicianId) {
		TechnicianId = technicianId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getSpecialist() {
		return specialist;
	}
	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}
	public void save(TechnicianModel hr) {
		// TODO Auto-generated method stub
		
	}
	public List<TechnicianModel> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
