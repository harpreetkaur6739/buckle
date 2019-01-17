package com.pro.buckle.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="user")
public class User {

	@Id
	private String id;
	
	private String userId;
	
	private String email;
	
	public User() {}
	
	public User(String userId, String email) {
		this.userId = userId;
		this.email = email;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return new String("Id=" + id + ", UserId=" + userId + ", Email="+email);
	}
	
	
}
