package com.practice.userservice.entity.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.userservice.entity.User;
import com.practice.userservice.service.MapValidationErrorService;
import com.practice.userservice.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	MapValidationErrorService mapValidationErrorService;
	
	@PostMapping("/")
	public ResponseEntity<?> createUser(@Valid @RequestBody User user,BindingResult result)
	{
		ResponseEntity<?> errorMap= mapValidationErrorService.mapValidationError(result);
		if(errorMap!=null) 
			return errorMap;
		   
		User user1=userService.createUser(user);
		
		return new ResponseEntity<User>(user1,HttpStatus.OK);
	}
	
	@DeleteMapping("/{userId}")
	public ResponseEntity<?>  deleteUser(@PathVariable Long userId) {
		return new ResponseEntity<String>(userService.deleteUser(userId),HttpStatus.OK);
	}
	
	
	@PutMapping("/")
	public ResponseEntity<?> updateUser(@Valid @RequestBody User user,BindingResult result)
	{
		ResponseEntity<?> errorMap= mapValidationErrorService.mapValidationError(result);
		if(errorMap!=null) 
			return errorMap;
		   
		User user1=userService.updateUser(user);
		
		return new ResponseEntity<User>(user1,HttpStatus.OK);
	}
	
	
	

}
