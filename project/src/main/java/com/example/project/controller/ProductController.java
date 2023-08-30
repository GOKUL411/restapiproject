package com.example.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.model.ProductModel;
import com.example.project.service.ProductService;


@RestController
public class ProductController {
	@Autowired
	public ProductService pserv;
	@PostMapping("/postAppliancid")
	private String postHotel(@RequestBody ProductModel hr)
	{
		pserv.saveHotel(hr);
		return "product  id of the customer data is saved";
	}
	@GetMapping("/getPAppliancid")
	public List<ProductModel> getApplianceInfo()
	{
		return pserv.getHotel();
	}
	
	
}
