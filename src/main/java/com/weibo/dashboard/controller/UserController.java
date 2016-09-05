package com.weibo.dashboard.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.weibo.dashboard.entity.User;
import com.weibo.dashboard.service.UserService;

@RestController
@RequestMapping(value="/user")
public class UserController {
	@Resource 
	UserService userService;

	
	@ResponseBody
	@RequestMapping(value="/{name}",method=RequestMethod.GET)
	public User findUser(@PathVariable("name")String name){
		User user = userService.select(name);
		return user;
	}
	
//	@ResponseBody
//	@RequestMapping(value="/{name}",method=RequestMethod.GET)
//	public int userNameExits(@PathVariable("name")String name){
//		int res = userService.userNameExits(name);
//		return res;
//	}
	
	@ResponseBody
	@RequestMapping(value="",method=RequestMethod.POST)
	public int accountValid(@RequestBody User user){
		int res = userService.accountValid(user);
		return res;
	}
	
	@ResponseBody
	@RequestMapping(value="",method=RequestMethod.POST)
	public int insert(@RequestBody User user){
		int res = userService.insert(user);
		return res;
	}
	
}
