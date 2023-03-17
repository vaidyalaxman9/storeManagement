package com.home.practice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.home.practice.bo.EmployeeProfileBo;
import com.home.practice.entity.EmployeeProfile;

@RestController
@RequestMapping("/employeeProfile")
public class EmployeeProfileController {

	@Autowired
	EmployeeProfileBo employeeProfileBo;

	@GetMapping(value = "employeeProfile", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<EmployeeProfile> getAllEmployeeProfile() {
		return employeeProfileBo.getAllEmployeeProfile();
	}

	@PostMapping(value = "/employeeProfile", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeProfile saveEmployeeProfile(@RequestBody EmployeeProfile employeeProfile) {
		return employeeProfileBo.saveEmployeeProfile(employeeProfile);
	}

	@PutMapping(value = "/employeeProfile", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeProfile updateEmployeeProfile(@RequestBody EmployeeProfile employeeProfile) {
		return employeeProfileBo.updateEmployeeProfile(employeeProfile);
	}

	@DeleteMapping(value = "/employeeProfile/{profileId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public String deleteEmployeeProfile(@PathVariable("profileId") Integer id) {
		return employeeProfileBo.deleteEmployeeProfile(id);
	}
}
