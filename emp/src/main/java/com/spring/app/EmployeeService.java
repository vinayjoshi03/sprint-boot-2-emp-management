package com.spring.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	@Autowired
	EmployeeRepository empRepository;
	public EmployeeService() {}
	
	public List<Employee> getAllEmployee() {
		return empRepository.findAll();
	}

}
