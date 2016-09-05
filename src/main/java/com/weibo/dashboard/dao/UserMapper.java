package com.weibo.dashboard.dao;

import org.apache.ibatis.annotations.Param;

import com.weibo.dashboard.entity.User;

public interface UserMapper {
	User select(@Param("name")String name);
	int userNameExits(@Param("name")String name);
	User accountValid(User user);
	int insert(User user);
}
