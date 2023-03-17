package com.home.practice.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.home.practice.entity.EmployeeProfile;
import com.home.practice.repository.EmployeeProfileRepository;

@Service
public class EmployeeProfileBo {

	@Autowired
	EmployeeProfileRepository employeeProfileRepository;

	public List<EmployeeProfile> getAllEmployeeProfile() {
		return employeeProfileRepository.findAll();
	}

	public EmployeeProfile saveEmployeeProfile(EmployeeProfile employeeProfile) {
		employeeProfileRepository.save(employeeProfile);
		return employeeProfile;
	}

	public EmployeeProfile updateEmployeeProfile(EmployeeProfile employeeProfile) {
		employeeProfileRepository.save(employeeProfile);
		return employeeProfile;
	}

	public String deleteEmployeeProfile(Integer id) {
		employeeProfileRepository.deleteById(id);
		return "{\"status\": true, message: \"EmployeeProfile record deleted successfully\"}";
	}
}
