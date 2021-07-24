package com.usertest.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usertest.entity.User;
import com.usertest.repositry.UserRepositry;
import com.usertest.service.UserService;

@Service
public class UserServiceImplementation implements UserService {

	@Autowired
	private UserRepositry userRepositry;

	@Override
	public List<User> getAllUsers() {

		return (List<User>) userRepositry.findAll();
	}

	@Override
	public User getUSerByID(int userId) {

		return userRepositry.findById(userId).orElse(null);
	}

	@Override
	public User addOrUpdateUser(User user) {

		return userRepositry.save(user);
	}

	@Override
	public User updateUser(User user) {
		return userRepositry.save(user);
	}
	
	@Override
	public User deleteUser(int userId) throws Exception {

		User deletedUser = null;
		try {
			deletedUser = userRepositry.findById(userId).orElse(null);
			if (deletedUser == null) {
				throw new Exception("user not available");
			} else {
				userRepositry.deleteById(userId);
			}
		} catch (Exception ex) {
			throw ex;
		}
		return null;
	}

}
