package com.example.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.project.model.TechnicianModel;
import com.example.project.service.TechnicianService;


@RestController
public class TechnicianController {
	@Autowired
	public TechnicianService tserv;
	@PostMapping("/posttechnicianid")
	private String postHotel(@RequestBody TechnicianModel hr)
	{
		tserv.saveHotel(hr);
		return "product  id of the customer data is saved";
	}
	@GetMapping("/gettechnicianid")
	public List<TechnicianModel> getApplianceInfo()
	{
		return tserv.getHotel();

}
}
