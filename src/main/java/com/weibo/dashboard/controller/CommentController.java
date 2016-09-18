package com.weibo.dashboard.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.weibo.dashboard.entity.Comment;
import com.weibo.dashboard.service.CommentService;
import com.weibo.util.ResponseData;

@RestController
@RequestMapping(value="/comment")
public class CommentController {
	@Resource
	CommentService commentService;
	
	@RequestMapping(value="/new",method=RequestMethod.POST)
	public ResponseData add(@RequestBody Comment comment){
		commentService.insert(comment);
		return new ResponseData(comment);
	}
	@RequestMapping(value="/{id}",method=RequestMethod.DELETE)
	public void delete(@PathVariable("id") int id){
		commentService.delete(id);
	}
}
