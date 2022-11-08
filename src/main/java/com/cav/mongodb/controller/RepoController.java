package com.cav.mongodb.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cav.mongodb.entity.Customer;
import com.cav.mongodb.repository.CustomerRepository;
import com.mongodb.client.ListDatabasesIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

@RestController
public class RepoController {
	
	@Autowired
	CustomerRepository customerRepository;

	@GetMapping("/status")
	public String homePage() {
		return "UP";
	}
	
	@GetMapping("/connection")
	public String mongodbClient() {
		//"mongodb://mongodb:27017"
		MongoClient client = MongoClients.create("mongodb://mongodb-service:27017");
	    ListDatabasesIterable<org.bson.Document> databases = client.listDatabases();
	    return client.toString();
	}
	
	
	@PostMapping("/addCustomer")
	public Customer addCustomer(@RequestBody Customer customer) {
		System.out.println("CUSTMER : "+customer.toString());
		customerRepository.save(customer);
		return customer;
	}
	
	@PostMapping("/findCustomer")
	public Customer findCustomer(@RequestBody String customerId) {
		Optional<Customer> customer = customerRepository.findById(customerId);
		return customer.get();
	}
	
	@GetMapping("/findAllCustomers")
	public List<Customer> findAllCustomers() {
		List<Customer> customers = customerRepository.findAll();
		return customers;
	}
}
