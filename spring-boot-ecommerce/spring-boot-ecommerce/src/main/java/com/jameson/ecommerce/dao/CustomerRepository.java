package com.jameson.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.jameson.ecommerce.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
