package com.usertest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.usertest.entity.User;
import com.usertest.service.UserService;

@RestController
@RequestMapping("/user")
public class UserControllerr {

	@Autowired
	private UserService userService;

	@GetMapping("/allUser")
	public ResponseEntity<List<User>> getAllUser() {
		List<User> user = null;
		try {
			user = userService.getAllUsers();
		} catch (Exception ex) {
			ex.getMessage();
		}

		return new ResponseEntity<List<User>>(user, HttpStatus.OK);

	}

	@GetMapping("/getById/{id}")
	public ResponseEntity<User> getUserById(@PathVariable("id") int userID) {
		User user = null;
		try {
			user = userService.getUSerByID(userID);
		} catch (Exception ex) {
			ex.getMessage();
		}

		return new ResponseEntity<User>(user, HttpStatus.OK);

	}

	@PostMapping("/addorUpdate")
	public ResponseEntity<User> addOrUpdate(@RequestBody User user) {
		User user1 = null;
		try {
			user1 = userService.addOrUpdateUser(user);
		} catch (Exception ex) {
			ex.getMessage();
		}

		return new ResponseEntity<User>(user1, HttpStatus.OK);

	}
	@PutMapping("/updateUser")
	public ResponseEntity<User> updateUser(@RequestBody User user) {
		User user1 = null;
		try {
			user1 = userService.addOrUpdateUser(user);
		} catch (Exception ex) {
			ex.getMessage();
		}

		return new ResponseEntity<User>(user1, HttpStatus.OK);

	}

	@DeleteMapping("/delete/{Id}")
	public ResponseEntity<User> deleteUser(@PathVariable("id") int userId) {
		User user1 = null;
		try {
			user1 = userService.deleteUser(userId);
		} catch (Exception ex) {
			ex.getMessage();
		}

		return new ResponseEntity<User>(user1, HttpStatus.OK);

	}
}