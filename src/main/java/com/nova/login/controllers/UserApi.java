package com.nova.login.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nova.login.entities.Customer;
import com.nova.login.services.IUser;

@RestController
public class UserApi {
	
	@Autowired
	private IUser user;
	
	@RequestMapping(value="/user/{userId}", method=RequestMethod.GET)
	public ResponseEntity<Boolean> findById(@PathVariable(value="userId") int userId) {
		boolean exists = user.findById(userId).isPresent();
		return new ResponseEntity<>(user.findById(userId).isPresent(), exists?HttpStatus.FOUND:HttpStatus.NOT_FOUND);
	}
	
}
