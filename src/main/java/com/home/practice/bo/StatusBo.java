package com.home.practice.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.home.practice.entity.Status;
import com.home.practice.repository.StatusRepository;

@Service
public class StatusBo {

	@Autowired
	StatusRepository statusRepository;

	public Status saveStatus(Status status) {
		statusRepository.save(status);
		return status;
	}

	public List<Status> getAllStatus() {
		return statusRepository.findAll();
	}
}
