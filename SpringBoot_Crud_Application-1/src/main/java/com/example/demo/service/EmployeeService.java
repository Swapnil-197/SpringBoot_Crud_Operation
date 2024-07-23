package com.example.demo.service;

import com.example.demo.entity.Employee;

public interface EmployeeService {

	public String addEmployee(Employee employee);
	
	public Employee getEmployee(Integer id);
	
}
