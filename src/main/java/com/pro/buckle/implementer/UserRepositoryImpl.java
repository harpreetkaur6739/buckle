package com.pro.buckle.implementer;

import java.util.List;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.pro.buckle.dao.UserRepository;
import com.pro.buckle.model.User;

@Repository
public class UserRepositoryImpl implements UserRepository{
	
	
	private MongoTemplate mongoTemplate;
	
	public UserRepositoryImpl(MongoTemplate temp) {
		this.mongoTemplate = temp;
	}

	@Override
	public List<User> getAllUsers() {
		return mongoTemplate.findAll(User.class);
	}

	@Override
	public User addUser(User user) {
		return mongoTemplate.save(user);
	}

	@Override
	public User getById(String id) {
		return mongoTemplate.findById(id, User.class);		
	}

	@Override
	public void deleteUserById(String id) {
		User user = new User();
		user.setUserId(id);
		mongoTemplate.remove(user);
		
	}
	

}
