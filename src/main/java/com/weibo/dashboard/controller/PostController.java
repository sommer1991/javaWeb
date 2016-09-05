package com.weibo.dashboard.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weibo.dashboard.service.PostService;

@RestController
@RequestMapping(value="/post")
public class PostController {
	@Resource
	PostService postService;
}
