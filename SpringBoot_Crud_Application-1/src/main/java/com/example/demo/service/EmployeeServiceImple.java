package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeServiceImple implements EmployeeService {

	@Autowired
	private EmployeeRepository repository;
	
	@Override
	public String addEmployee(Employee employee) {
		repository.save(employee);
		return "Success";
	}

	@Override
	public Employee getEmployee(Integer id) {
		 Optional<Employee> byId = repository.findById(id);
		 if(byId.isPresent()) {
			 return byId.get();
		 }
		
		 return null;
	}

}
