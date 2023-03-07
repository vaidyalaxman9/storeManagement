package com.home.practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.home.practice.bo.StatusGroupBo;
import com.home.practice.entity.StatusGroup;

@RestController
@RequestMapping("/statusgroup")
public class StatusGroupController {

	@Autowired
	StatusGroupBo statusGroupBo;

	@PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public StatusGroup saveStatusGroup(@RequestBody StatusGroup statusGroup) {
		return statusGroupBo.saveStatusGroup(statusGroup);
	}
}
