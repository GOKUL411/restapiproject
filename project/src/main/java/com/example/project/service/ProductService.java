package com.example.project.service;



import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import com.example.project.model.ProductModel;

import com.example.project.repository.ProductRepo;


@Service
public class ProductService {
	@Autowired
	public ProductRepo prepo;
	//post
	public String saveHotel(ProductModel hr)
	{
		prepo.save(hr);
		return "Data is saved to database";
	}
	//get
	public List<ProductModel> getHotel()
	{
		return prepo.findAll();
	}
	
	


}
