package com.home.practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.home.practice.entity.OrderPayment;

@Repository
public interface OrderPaymentRepository extends JpaRepository<OrderPayment, Integer> {

}
