package com.home.practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.home.practice.entity.StatusGroup;

@Repository
public interface StatusGroupRepository extends JpaRepository<StatusGroup , Integer> {

}
