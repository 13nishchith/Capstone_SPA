package com.spa_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spa_project.entity.Customer;

@Repository
// Here we are using JpaRepository for CRUD operations 
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
