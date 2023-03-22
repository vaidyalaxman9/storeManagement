package com.home.practice.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.home.practice.entity.CustomerAddress;
import com.home.practice.repository.CustomerAddressRepository;

@Service
public class CustomerAddressBo {

	@Autowired
	CustomerAddressRepository customerAddressRepository;

	public CustomerAddress saveCustomerAddress(CustomerAddress customerAddress) {
		customerAddressRepository.save(customerAddress);
		return customerAddress;
	}

	public List<CustomerAddress> getAllCustomerAddress() {
		return customerAddressRepository.findAll();
	}
}
