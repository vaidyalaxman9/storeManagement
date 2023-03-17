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

import com.home.practice.bo.ProductCategoryBo;
import com.home.practice.entity.ProductCategory;

@RestController
@RequestMapping("/productCategory")
public class ProductCategoryController {

	@Autowired
	ProductCategoryBo productCategoryBo;

	@GetMapping(value = "productCategory", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<ProductCategory> getAllProductCategory() {
		return productCategoryBo.getAllProductCategory();
	}

	@PostMapping(value = "/productCategory", produces = MediaType.APPLICATION_JSON_VALUE)
	public ProductCategory saveProductCategory(@RequestBody ProductCategory productCategory) {
		return productCategoryBo.saveProductCategory(productCategory);
	}

	@PutMapping(value = "/productCategory", produces = MediaType.APPLICATION_JSON_VALUE)
	public ProductCategory updateProductCategory(@RequestBody ProductCategory productCategory) {
		return productCategoryBo.updateProductCategory(productCategory);
	}

	@DeleteMapping(value = "/productCategory/{categoryId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public String deleteProductCategory(@PathVariable("categoryId") Integer id) {
		return productCategoryBo.deleteProductCategory(id);
	}
}
