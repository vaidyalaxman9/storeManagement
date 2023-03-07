package com.home.practice.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.home.practice.entity.StatusGroup;
import com.home.practice.repository.StatusGroupRepository;

@Service
public class StatusGroupBo {

	@Autowired
	StatusGroupRepository statusGroupRepository;

	public StatusGroup saveStatusGroup(StatusGroup statusGroup) {
		statusGroupRepository.save(statusGroup);
		return statusGroup;
	}
}
