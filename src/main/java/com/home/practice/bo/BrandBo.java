package com.home.practice.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.home.practice.entity.Brand;
import com.home.practice.repository.BrandRepository;

@Service
public class BrandBo {

	@Autowired
	BrandRepository brandRepository;

	public List<Brand> getAllBrands() {
		return brandRepository.findAll();
	}

	public Brand saveBrand(Brand brand) {
		brandRepository.save(brand);
		return brand;
	}

	public Brand updateBrand(Brand brand) {
		brandRepository.save(brand);
		return brand;
	}

	public String deleteBrand(Integer id) {
		brandRepository.deleteById(id);
		return "{\"status\": true, message: \"brand record deleted successfully\"}";
	}
}
