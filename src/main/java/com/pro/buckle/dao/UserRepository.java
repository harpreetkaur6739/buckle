package com.pro.buckle.dao;

import java.util.List;
import com.pro.buckle.model.User;

public interface UserRepository{
	
	List<User> getAllUsers();
	
	User addUser(User user);
	
	User getById(String id);
	
	void deleteUserById(String id);
}
