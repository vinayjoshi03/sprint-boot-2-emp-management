package com.spring.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService es;
	@GetMapping("/get-all-users")
	public List<Employee> getAllEmployees() {
		return es.getAllEmployee();
	}
	
}
