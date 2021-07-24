package com.usertest.service;

import java.util.List;

import com.usertest.entity.User;

public interface UserService {
	
	public List<User> getAllUsers();
	public User getUSerByID(int userId);
	public User addOrUpdateUser(User user);
	public User updateUser(User user);
	public User deleteUser(int userID ) throws Exception;
	
	
}
