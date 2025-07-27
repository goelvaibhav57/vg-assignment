package com.nagp.b3.vg_assignment.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.nagp.b3.vg_assignment.model.UserData;

public interface UserRepository  extends CrudRepository<UserData, Long>{

	public List<UserData> findAll();
}
