package com.nova.login.services;

import java.util.Optional;

import com.nova.login.entities.Customer;

public interface IUser {
	
	public Optional<Customer> findById(int user);
	
}