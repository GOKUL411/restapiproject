package com.example.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.project.model.TechnicianModel;

public interface TechnicianRepo  extends JpaRepository<TechnicianModel, Integer> {

}
