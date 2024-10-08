package com.payilagam.Company;

public class Employee {
	
	
	String name;
	String department;
	int experience;
	int salary;
	
	public Employee(String name, String department, int experience, int salary) {
		//super();
		this.name = name;
		this.department = department;
		this.experience = experience;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", department=" + department + ", experience=" + experience + ", salary="
				+ salary + "]";
	}
	
	
	

}
