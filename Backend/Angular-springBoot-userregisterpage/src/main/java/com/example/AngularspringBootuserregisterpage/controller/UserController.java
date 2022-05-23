package com.example.AngularspringBootuserregisterpage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.AngularspringBootuserregisterpage.Repository.UserRepo;
import com.example.AngularspringBootuserregisterpage.model.User;
import com.example.AngularspringBootuserregisterpage.service.UserService;
@CrossOrigin(origins="http://localhost:4200")
@RestController
public class UserController {
	
	@Autowired
	private UserService service;
	@PostMapping("/registeruser")
	public User signUp(@RequestBody User user) throws Exception
	{
		String tempUsername=user.getName();
		if(tempUsername!=null && !"".equals(tempUsername))
		{
		User userobj=service.fetchUserByName(tempUsername);
		if(userobj!=null)
		{
			throw new Exception("user with"+ tempUsername + "is already exist");
		}
		}
		User userobj=null;
		userobj=service.saveUser(user);
		return userobj;
	}
	@PostMapping("/login")
	public User loginUser(@RequestBody User user) throws Exception
	{
		String tempUserName=user.getName();
		String tempPassword=user.getPassword();
		User userobj=null;
		if(tempUserName!=null && tempPassword!=null)
		{
			userobj=service.fetchUserByNameAndPassword(tempUserName, tempPassword);
		}
		if(userobj==null)
		{
			throw new Exception("User doesnot exist");
		}
		return userobj;
	}
}
