package com.nova.login.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.nova.login.entities.Customer;

public interface UserRepository extends CrudRepository<Customer, Integer> {
	
}
