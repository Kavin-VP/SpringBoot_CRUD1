package com.payilagam.Company;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CompanyService {
	
	public List<Employee> empList=new ArrayList<>();
	
	public List<Employee> getDetails()
	{
		
		return empList;
	}

	public String addEmployee(Employee employee) {
		empList.add(employee);
		return "Employee Added Successfully";
	}

	public String updateEmployee(String name, int salary) {
		
		for(Employee employee:empList)
		{
			if(employee.getName().equals(name))
			{
				employee.setSalary(salary);
				return "Successfully Updated";
			}
		}
		return "Employee not found";
	}

	public String removeEmployee(String name) {
		
		for(Employee employee:empList)
		{
			if(employee.getName().equals(name))
			{
				empList.remove(employee);
				
				return "Employee removed successfully";
			}
		}
		return "Employee not found";
	}

}
