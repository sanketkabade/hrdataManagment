package com.CURD;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepo repo;
	

	 public EmployeeDetails saveEmployeeDetails(EmployeeDetails employee) {
	        return repo.save(employee);
	    }
	
	
	public EmployeeDetails updateEmployeeDetails( Integer id,  EmployeeDetails EmployeeDetails) {
		Optional<EmployeeDetails> optionalEmployeeDetails = repo.findById(id);
		if(optionalEmployeeDetails.isPresent()) {
			EmployeeDetails existingEmployeeDetails = optionalEmployeeDetails.get();
			existingEmployeeDetails.setAddress(EmployeeDetails.getAddress());
			existingEmployeeDetails.setContact(EmployeeDetails.getContact());
			existingEmployeeDetails.setEmail(EmployeeDetails.getEmail());
			existingEmployeeDetails.setEname(EmployeeDetails.getEname());
			existingEmployeeDetails.setDsignation(EmployeeDetails.getDsignation());
			existingEmployeeDetails.setGender(EmployeeDetails.getGender());
			existingEmployeeDetails.setPack(EmployeeDetails.getPack());
			return repo.save(existingEmployeeDetails);
		}return null;		
	  } 
	
	
	public void deleteById(Integer id) {
		 repo.deleteById(id);
	} 
	
	public Optional<EmployeeDetails> getEmployeeById(Integer id) {
		return repo.findById(id);
	}
	
	  public List<EmployeeDetails> getEmployees() {
			return repo.findAll();
		}
	  
	public long totalEmployees()
	{
		return repo.count();
	}
	
	public long femaleEmployees()
	{
		return repo.countFemaleEmployees();
	}
	
	public long maleEmployees()
	{
		return repo.countMaleEmployees();
	}
	
	
}
