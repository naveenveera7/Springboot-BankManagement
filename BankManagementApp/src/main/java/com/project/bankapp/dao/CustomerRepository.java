package com.project.bankapp.dao;

import org.springframework.data.repository.CrudRepository;

import com.project.bankapp.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {

}
