package com.weibo.dashboard.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.weibo.dashboard.entity.Post;

public interface PostMapper {
	List<Post> findList();
	List<Post> postByUser(@Param("userName") String userName);
	int insert(Post post);
	int delete(@Param("id") int id);
	int like(@Param("id") int id);
	int dislike(@Param("id") int id);
	
}
