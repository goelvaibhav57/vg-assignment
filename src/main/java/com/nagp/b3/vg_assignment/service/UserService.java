package com.nagp.b3.vg_assignment.service;

import java.util.List;

import com.nagp.b3.vg_assignment.model.UserData;

public interface UserService {
	
	public List<UserData> getAllUsers();
	
	public UserData addUserData(UserData data);
	

}
