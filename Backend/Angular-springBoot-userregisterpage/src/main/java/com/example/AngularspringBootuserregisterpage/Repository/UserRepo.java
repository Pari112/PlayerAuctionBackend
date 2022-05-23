package com.example.AngularspringBootuserregisterpage.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.AngularspringBootuserregisterpage.model.User;

@Repository
public interface UserRepo extends JpaRepository<User,String> {
	public User findByName(String name);
	public User findByNameAndPassword(String name,String password);

}
