package com.CURD;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@CrossOrigin("*")

@RestController
public class EmployeeControlar {
	
	  @Autowired
	    private EmployeeService service;


	    @PostMapping("/addEmployee")
		public EmployeeDetails saveEmployee(@RequestBody EmployeeDetails Employee) {
			return service.saveEmployeeDetails(Employee);
		}

	@PutMapping("/updateEmployeeDetails/{id}")
	public ResponseEntity<EmployeeDetails> updateEmployeeDetails(@PathVariable Integer id,@RequestBody  EmployeeDetails employee) {
		
		EmployeeDetails updateEmployee = service.updateEmployeeDetails(id, employee) ;
		if(updateEmployee == null) return ResponseEntity.status(HttpStatus.BAD_REQUEST).build()	;
		return ResponseEntity.ok(updateEmployee);
	} 

	@DeleteMapping("/deleteEmployeeDetails/{id}")

	public void deleteEmployee(@PathVariable Integer id) {
		service.deleteById(id);
	}

	@GetMapping("/selectById/{Id}")
	public Optional<EmployeeDetails> getEmployeeDetailsById(@PathVariable Integer Id) {
		return service.getEmployeeById(Id);
	}


	@GetMapping("/allEmployeeDetails")
	public List<EmployeeDetails> getEmployeeDetailss() {
		return service.getEmployees();

	}
	@GetMapping("/totalEmployees")
    public long countEmployees() {
        return service.totalEmployees();
    }
    
    @GetMapping("/femaleEmployees")
    public long countFemaleEmployees() {
        return service.femaleEmployees();
    }
    
    @GetMapping("/maleEmployees")
    public long countMaleEmployees() {
        return service.maleEmployees();
    }
	
	
	

}
