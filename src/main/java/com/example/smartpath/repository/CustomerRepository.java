package com.example.smartpath.repository;

import com.example.smartpath.model.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CustomerRepository extends CrudRepository<Customer , Integer> {
    Optional<Customer> findByEmail(String email);
}
