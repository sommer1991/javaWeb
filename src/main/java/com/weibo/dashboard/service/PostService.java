package com.weibo.dashboard.service;

import java.util.List;

import com.weibo.dashboard.entity.Post;

public interface PostService {
	List<Post> findList();

	List<Post> postByUser(String userName);

	int insert(Post post);

	int delete(int id);

	int like(int id);

	int dislike(int id);
}
