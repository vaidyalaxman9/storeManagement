package com.home.practice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.home.practice.bo.CustomerAddressBo;
import com.home.practice.entity.CustomerAddress;

@RestController
@RequestMapping("/customerAddress")
public class CustomerAddressController {

	@Autowired
	CustomerAddressBo customerAddressBo;

	@PostMapping(value = "/customerAddress", produces = MediaType.APPLICATION_JSON_VALUE)
	public CustomerAddress saveCustomerAddress(@RequestBody CustomerAddress customerAddress) {
		return customerAddressBo.saveCustomerAddress(customerAddress);
	}

	@GetMapping(value = "customerAddress", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<CustomerAddress> getAllCustomerAddress() {
		return customerAddressBo.getAllCustomerAddress();
	}
}
