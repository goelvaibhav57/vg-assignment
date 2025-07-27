package com.nagp.b3.vg_assignment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nagp.b3.vg_assignment.model.UserData;
import com.nagp.b3.vg_assignment.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/get-users")
	public List<UserData> getAllUsers(){
		return userService.getAllUsers();
	}
	
	@PostMapping("/add-user")
	public UserData createUser(@RequestBody UserData userData){
		return userService.addUserData(userData);
	}
	
}
