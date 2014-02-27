package com.akelio.example.view;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import com.akelio.example.entity.User;
import com.akelio.example.service.UserService;

@Named
@ViewScoped
public class UserView implements Serializable {

	private User		user;

	@Inject
	private UserService	userService;

	public UserView() {
		super();
	}

	@PostConstruct
	public void init() {
		user = userService.findUser();
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
