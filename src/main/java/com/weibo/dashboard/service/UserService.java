package com.weibo.dashboard.service;

import com.weibo.dashboard.entity.User;

public interface UserService {
	User select(String name);
	int userNameExits(String name);
	int accountValid(User user);
	int insert(User user);
}
