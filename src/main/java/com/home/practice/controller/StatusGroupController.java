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

import com.home.practice.bo.StatusGroupBo;
import com.home.practice.entity.StatusGroup;

@RestController
@RequestMapping("/statusGroup")
public class StatusGroupController {

	@Autowired
	StatusGroupBo statusGroupBo;

	@PostMapping(value = "/statusGroup", produces = MediaType.APPLICATION_JSON_VALUE)
	public StatusGroup saveStatusGroup(@RequestBody StatusGroup statusGroup) {
		return statusGroupBo.saveStatusGroup(statusGroup);
	}

	@GetMapping(value = "statusGroups", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<StatusGroup> getAllStatusGroups() {
		return statusGroupBo.getAllStatusGroups();
	}

	@PutMapping(value = "/statusGroup", produces = MediaType.APPLICATION_JSON_VALUE)
	public StatusGroup updateStatusGroup(@RequestBody StatusGroup statusGroup) {
		return statusGroupBo.updateStatusGroup(statusGroup);
	}

	@DeleteMapping(value = "/statusGroup/{statusGroupId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public String deleteStatusGroup(@PathVariable("statusGroupId") Integer id) {
		return statusGroupBo.deleteStatusGroup(id);
	}
}
