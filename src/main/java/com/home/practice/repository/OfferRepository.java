package com.home.practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.home.practice.entity.Offer;

@Repository
public interface OfferRepository extends JpaRepository<Offer, Integer> {

}
