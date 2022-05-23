package com.example.AngularspringBootuserregisterpage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.AngularspringBootuserregisterpage.Repository.UserRepo;
import com.example.AngularspringBootuserregisterpage.model.User;

@Service
public class UserService {
	@Autowired
	private UserRepo repo;
	public User saveUser(User user)
	{
		return repo.save(user);
	}
	
	public User fetchUserByName(String name)
	{
		return repo.findByName(name);
	}
	
	public User fetchUserByNameAndPassword(String name,String password)
	{
		return repo.findByNameAndPassword(name, password);
	}

}
