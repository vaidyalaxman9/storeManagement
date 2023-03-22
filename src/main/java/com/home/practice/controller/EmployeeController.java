package com.home.practice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.home.practice.bo.EmployeeBo;
import com.home.practice.entity.Employee;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	EmployeeBo employeeBo;

	@PostMapping(value = "/employee", produces = MediaType.APPLICATION_JSON_VALUE)
	public Employee saveEmployee(@RequestBody Employee employee) {
		return employeeBo.saveEmployee(employee);
	}

	@GetMapping(value = "employee", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> getAllEmployee() {
		return employeeBo.getAllEmployee();
	}

	@PutMapping(value = "/employee", produces = MediaType.APPLICATION_JSON_VALUE)
	public Employee updateEmployee(@RequestBody Employee employee) {
		return employeeBo.updateEmployee(employee);
	}

}
