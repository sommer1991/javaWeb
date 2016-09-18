package com.weibo.dashboard.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.weibo.dashboard.dao.CommentMapper;
import com.weibo.dashboard.entity.Comment;
import com.weibo.dashboard.service.CommentService;
@Service
public class CommentServiceImpl implements CommentService{

	@Resource
	CommentMapper commentMapper;
	public int insert(Comment comment) {
		return commentMapper.insert(comment);
	}

	public int delete(int id) {
		return commentMapper.delete(id);
	}

}
