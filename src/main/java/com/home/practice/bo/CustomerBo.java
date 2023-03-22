package com.home.practice.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.home.practice.entity.Customer;
import com.home.practice.repository.CustomerRepository;

@Service
public class CustomerBo {

	@Autowired
	CustomerRepository customerRepository;

	public Customer saveCustomer(Customer customer) {
		customerRepository.save(customer);
		return customer;
	}

	public List<Customer> getAllCustomer() {
		return customerRepository.findAll();
	}

	public Customer updateCustomer(Customer customer) {
		customerRepository.save(customer);
		return customer;
	}

	public String deleteCustomer(Integer id) {
		customerRepository.deleteById(id);
		return "{\"status\": true, message: \"Customer record deleted successfully\"}";
	}
}
