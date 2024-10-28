package com.test.creational.factory;

import java.util.Arrays;

public class BlogPost extends Post {
	private String author;
	private String[] tags;
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String[] getTags() {
		return tags;
	}
	public void setTags(String[] tags) {
		this.tags = tags;
	}
	
	@Override
	public String toString() {
		return "BlogPost{"+"author'"+author+'\''+
				", tags="+ Arrays.toString(tags)+'\''+'}';
	}
}
