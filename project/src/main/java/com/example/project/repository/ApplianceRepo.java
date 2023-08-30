package com.example.project.repository;



import org.springframework.data.jpa.repository.JpaRepository;



import com.example.project.model.ApplianceModel;
import com.example.project.model.ProductModel;





public interface ApplianceRepo extends JpaRepository<ApplianceModel, Integer> {



	




	void save(ProductModel hr);
	
		
		
	
		
		

		
		

}
