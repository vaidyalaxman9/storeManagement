package com.home.practice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.home.practice.bo.StatusBo;
import com.home.practice.entity.Status;

@RestController
@RequestMapping("/status")
public class StatusController {

	@Autowired
	StatusBo statusBo;

	@PostMapping(value = "/status", produces = MediaType.APPLICATION_JSON_VALUE)
	public Status saveStatus(@RequestBody Status status) {
		return statusBo.saveStatus(status);
	}

	@GetMapping(value = "status", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Status> getAllStatus() {
		
		List<Status> list= statusBo.getAllStatus();
		return list;
	}
}
