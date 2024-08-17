package com.payilagam.Company;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	CompanyService service;

	public MyController(CompanyService service) {
		
		this.service = service;
	}
	
	@GetMapping("/employee")
	public List<Employee> getEmployee()
	{
		return service.getDetails();
	}
	
	@PostMapping("/employee")
	public String addEmployee(@RequestBody Employee employee)
	{
		return service.addEmployee(employee);
	}
	
	@PutMapping("/employee")
	public String updateEmployee(@RequestParam String name,@RequestParam int salary)
	{
		return service.updateEmployee(name,salary);
		
	}
	
	@DeleteMapping("/employee")
	public String removeEmployee(@RequestParam String name)
	{
		return service.removeEmployee(name);
	}
}
