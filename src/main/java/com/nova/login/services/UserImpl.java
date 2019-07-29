package com.nova.login.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nova.login.entities.Customer;
import com.nova.login.repositories.UserRepository;

@Service
public class UserImpl implements IUser{
	
	@Autowired
	private UserRepository repository;

	@Override
	public Optional<Customer> findById(int user) {
		Optional<Customer> customer = repository.findById(user);
		return customer;
	}

}
