package com.pro.buckle.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pro.buckle.dao.UserRepository;
import com.pro.buckle.model.User;

@RestController
@RequestMapping(value="/")
public class UserController {

	private final UserRepository userRepo;
	
	public UserController(UserRepository userRepository) {
		this.userRepo = userRepository;
	}
	
	@RequestMapping(value="/users", method=RequestMethod.GET)
	public List<User> getAllUsers(){
		List<User> u = userRepo.getAllUsers();
		return u;
	}
	
	@RequestMapping(value="/create", method=RequestMethod.POST)
	public User addUser(@RequestBody User user) {
		return userRepo.addUser(user);
	}
	
	@RequestMapping(value="/user/{id}", method=RequestMethod.GET)
	public User getUserById(@PathVariable String id) {
		return userRepo.getById(id);
	}
	
	@RequestMapping(value="/user/delete/{id}", method=RequestMethod.GET)
	public void deleteUserById(@PathVariable String id) {
		
		userRepo.deleteUserById(id);
	}
	
	@RequestMapping(value="/error", method=RequestMethod.GET)
	public String error() {
		return "Unknown Error Occured!!";
	}
}
