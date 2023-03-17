package com.home.practice.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.home.practice.entity.ProductCategory;
import com.home.practice.repository.ProductCategoryRepository;

@Service
public class ProductCategoryBo {

	@Autowired
	ProductCategoryRepository productCategoryRepository;

	public List<ProductCategory> getAllProductCategory() {
		return productCategoryRepository.findAll();
	}

	public ProductCategory saveProductCategory(ProductCategory productCategory) {
		productCategoryRepository.save(productCategory);
		return productCategory;
	}

	public ProductCategory updateProductCategory(ProductCategory productCategory) {
		productCategoryRepository.save(productCategory);
		return productCategory;
	}

	public String deleteProductCategory(Integer id) {
		productCategoryRepository.deleteById(id);
		return "{\"status\": true, message: \"ProductCategory record deleted successfully\"}";
	}
}
