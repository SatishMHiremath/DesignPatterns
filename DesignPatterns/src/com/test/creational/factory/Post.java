package com.test.creational.factory;

import java.time.LocalDateTime;
import java.util.Arrays;

public class Post {
	
	private int id;
	private String title;
	private String content;
	private LocalDateTime createdOn;
	private LocalDateTime publishedOn;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public LocalDateTime getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(LocalDateTime createdOn) {
		this.createdOn = createdOn;
	}
	public LocalDateTime getPublishedOn() {
		return publishedOn;
	}
	public void setPublishedOn(LocalDateTime publishedOn) {
		this.publishedOn = publishedOn;
	}

	@Override
	public String toString() {
		return "Post{"+"title'"+title+'\''+
				", content="+ content+
				", createdOn='"+ createdOn+ '\''+
				", publishedOn= '"+ publishedOn+ '\''+'}';
	}
}
