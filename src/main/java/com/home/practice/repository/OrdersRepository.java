package com.home.practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.home.practice.entity.Orders;

@Repository
public interface OrdersRepository extends JpaRepository<Orders, Integer> {

}