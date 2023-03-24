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

import com.home.practice.bo.ProductBo;
import com.home.practice.entity.Product;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	ProductBo productBo;

	@PostMapping(value = "/product", produces = MediaType.APPLICATION_JSON_VALUE)
	public Product saveProduct(@RequestBody Product product) {
		return productBo.saveProduct(product);
	}

	@GetMapping(value = "product", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Product> getAllProduct() {
		return productBo.getAllProduct();
	}

	@PutMapping(value = "/product", produces = MediaType.APPLICATION_JSON_VALUE)
	public Product updateProduct(@RequestBody Product product) {
		return productBo.updateProduct(product);
	}

	@DeleteMapping(value = "/product/{productId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public String deleteProduct(@PathVariable("productId") Integer id) {
		return productBo.deleteProduct(id);
	}
}
