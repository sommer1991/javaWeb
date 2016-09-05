package com.weibo.dashboard.entity;

import java.util.Date;

public class Comment {
	private int id;
	private Date cDate;
	private String cContent;
	private String cAuthorName;
	private int postId;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getcDate() {
		return cDate;
	}
	public void setcDate(Date cDate) {
		this.cDate = cDate;
	}
	public String getcContent() {
		return cContent;
	}
	public void setcContent(String cContent) {
		this.cContent = cContent;
	}
	public String getcAuthorName() {
		return cAuthorName;
	}
	public void setcAuthorName(String cAuthorName) {
		this.cAuthorName = cAuthorName;
	}
	public int getPostId() {
		return postId;
	}
	public void setPostId(int postId) {
		this.postId = postId;
	}

}
