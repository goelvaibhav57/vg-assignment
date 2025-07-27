package com.nagp.b3.vg_assignment.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagp.b3.vg_assignment.model.UserData;
import com.nagp.b3.vg_assignment.repository.UserRepository;
import com.nagp.b3.vg_assignment.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public List<UserData> getAllUsers() {
		return userRepository.findAll();
	}

	@Override
	public UserData addUserData(UserData data) {
		 userRepository.save(data);
		 return data;
	}

}
