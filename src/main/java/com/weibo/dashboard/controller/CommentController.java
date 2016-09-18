package com.weibo.dashboard.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.weibo.dashboard.entity.Comment;
import com.weibo.dashboard.service.CommentService;

@RestController
@RequestMapping(value="/comment")
public class CommentController {
	@Resource
	CommentService commentService;
	
	@RequestMapping(value="/new",method=RequestMethod.POST)
	public void add(@RequestBody Comment comment){
		commentService.insert(comment);
	}
	@RequestMapping(value="/{id}",method=RequestMethod.DELETE)
	public void delete(@PathVariable("id") int id){
		commentService.delete(id);
	}
}
