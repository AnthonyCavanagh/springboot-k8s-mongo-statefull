package com.cav.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cav.mongodb.entity.Customer;


public interface CustomerRepository extends MongoRepository <Customer, String>{

}
