package com.example.AngularspringBootuserregisterpage.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="userregister")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	private String name;
   private int age;
   private String gender;
    private String hobbies;
   private String  password;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getHobbies() {
	return hobbies;
}
public void setHobbies(String hobbies) {
	this.hobbies = hobbies;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

public User()
{
	super();
}

public User(String name, int age, String gender, String hobbies, String password) {
	super();
	this.name = name;
	this.age = age;
	this.gender = gender;
	this.hobbies = hobbies;
	this.password = password;
}

   

}
