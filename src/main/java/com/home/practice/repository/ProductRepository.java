package com.home.practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.home.practice.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
