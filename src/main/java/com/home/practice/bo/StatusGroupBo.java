package com.home.practice.bo;

import java.util.List;

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

	public List<StatusGroup> getAllStatusGroups() {
		return statusGroupRepository.findAll();
	}

	public StatusGroup updateStatusGroup(StatusGroup statusGroup) {
		statusGroupRepository.save(statusGroup);
		return statusGroup;
	}

	public String deleteStatusGroup(Integer id) {
		statusGroupRepository.deleteById(id);
		return "{\"status\": true, message: \"statusGroup record deleted successfully\"}";
	}
}
