package com.home.practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.home.practice.entity123.Status;

@Repository
public interface StatusRepository extends JpaRepository<Status , Integer> {

}
