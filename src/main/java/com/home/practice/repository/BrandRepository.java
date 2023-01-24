package com.home.practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.home.practice.entity.Brand;


@Repository
public interface BrandRepository extends JpaRepository<Brand , Integer> {

}
