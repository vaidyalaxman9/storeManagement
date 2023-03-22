package com.home.practice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.home.practice.bo.CustomerBo;
import com.home.practice.entity.Customer;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	CustomerBo customerBo;

	@PostMapping(value = "/customer", produces = MediaType.APPLICATION_JSON_VALUE)
	public Customer saveCustomer(@RequestBody Customer customer) {
		return customerBo.saveCustomer(customer);
	}

	@GetMapping(value = "customer", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Customer> getAllCustomer() {
		return customerBo.getAllCustomer();
	}
}
