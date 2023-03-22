package com.home.practice.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.home.practice.entity.Employee;
import com.home.practice.repository.EmployeeRepository;

@Service
public class EmployeeBo {

	@Autowired
	EmployeeRepository employeeRepository;

	public Employee saveEmployee(Employee employee) {
		employeeRepository.save(employee);
		return employee;
	}

	public List<Employee> getAllEmployee() {
		return employeeRepository.findAll();
	}

	public Employee updateEmployee(Employee employee) {
		employeeRepository.save(employee);
		return employee;
	}

}
