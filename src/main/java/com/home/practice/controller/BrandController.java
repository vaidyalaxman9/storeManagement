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

import com.home.practice.bo.BrandBo;
import com.home.practice.entity.Brand;

@RestController
@RequestMapping("/brand")
public class BrandController {

	@Autowired
	BrandBo brandBo;

	@GetMapping(value = "brands", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Brand> getAllBrands() {
		return brandBo.getAllBrands();
	}

	@PostMapping(value = "/brand", produces = MediaType.APPLICATION_JSON_VALUE)
	public Brand saveBrand(@RequestBody Brand brand) {
		return brandBo.saveBrand(brand);
	}

	@PutMapping(value = "/brand", produces = MediaType.APPLICATION_JSON_VALUE)
	public Brand updateBrand(@RequestBody Brand brand) {
		return brandBo.updateBrand(brand);
	}

	@DeleteMapping(value = "/brand/{brandId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public String deleteBrand(@PathVariable("brandId") Integer id) {
		return brandBo.deleteBrand(id);
	}
}
