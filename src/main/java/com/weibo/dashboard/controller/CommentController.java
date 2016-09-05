package com.weibo.dashboard.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weibo.dashboard.service.CommentService;

@RestController
@RequestMapping(value="/comment")
public class CommentController {
	@Resource
	CommentService commentService;
}
