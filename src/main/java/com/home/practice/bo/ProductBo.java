package com.home.practice.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.home.practice.entity.Product;
import com.home.practice.repository.ProductRepository;

@Service
public class ProductBo {

	@Autowired
	ProductRepository productRepository;

	public Product saveProduct(Product product) {
		productRepository.save(product);
		return product;
	}

	public List<Product> getAllProduct() {
		return productRepository.findAll();
	}

	public Product updateProduct(Product product) {
		productRepository.save(product);
		return product;
	}

	public String deleteProduct(Integer id) {
		productRepository.deleteById(id);
		return "{\"status\": true, message: \"Product record deleted successfully\"}";
	}
}
