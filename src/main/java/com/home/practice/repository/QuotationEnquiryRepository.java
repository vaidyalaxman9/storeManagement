package com.home.practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.home.practice.entity.QuotationEnquiry;

@Repository
public interface QuotationEnquiryRepository extends JpaRepository<QuotationEnquiry, Integer> {

}
