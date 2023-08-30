package com.example.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.model.TechnicianModel;
import com.example.project.repository.TechnicianRepo;


@Service
public class TechnicianService {
	@Autowired
	public TechnicianRepo trepo;
	//post
			public String saveHotel(TechnicianModel hr)
			{
				trepo.save(hr);
				return "Data is saved to database";
			}
			//get
			public List<TechnicianModel> getHotel()
			{
				return trepo.findAll();
			}

}
