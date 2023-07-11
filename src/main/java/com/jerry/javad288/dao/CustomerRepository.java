package com.jerry.javad288.dao;

import com.jerry.javad288.Entities.Customer;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {



}
