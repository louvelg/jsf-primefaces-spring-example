package com.akelio.example.service;

import org.springframework.stereotype.Service;
import com.akelio.example.entity.User;

@Service("userService")
public class UserService {

	public User findUser() {
		User user = new User();
		user.setUserId(1L);
		user.setLogin("login1");
		user.setFirstName("John");
		user.setLastName("Doe");
		return user;
	}
}
