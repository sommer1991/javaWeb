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
import com.weibo.util.ResponseData;

@RestController
@RequestMapping(value="/user")
public class UserController {
	@Resource 
	UserService userService;
	
	@ResponseBody
	@RequestMapping(value="/{name}",method=RequestMethod.GET)
	public ResponseData findUser(@PathVariable("name")String name){
		User user = userService.select(name);
		return new ResponseData(user);
	}
	
	@ResponseBody
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public ResponseData accountValid(@RequestBody User user){
		boolean res = userService.accountValid(user);
		return new ResponseData(res);
	}
	@ResponseBody
	@RequestMapping(value="/new",method=RequestMethod.POST)
	public ResponseData insert(@RequestBody User user){
		userService.insert(user);
		return new ResponseData(user);
	}
	
}
