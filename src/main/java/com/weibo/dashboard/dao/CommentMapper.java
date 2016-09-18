package com.weibo.dashboard.dao;

import org.apache.ibatis.annotations.Param;

import com.weibo.dashboard.entity.Comment;

public interface CommentMapper {
	
	int insert(Comment comment);
	int delete(@Param("id") int id);
	
}
