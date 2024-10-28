package com.test.creational.factory;

import java.time.LocalDateTime;
import java.util.Arrays;

public class NewsPost extends Post {
	
	private String headlines;
	private LocalDateTime newsTime;
	public String getHeadlines() {
		return headlines;
	}
	public void setHeadlines(String headlines) {
		this.headlines = headlines;
	}
	public LocalDateTime getNewsTime() {
		return newsTime;
	}
	public void setNewsTime(LocalDateTime newsTime) {
		this.newsTime = newsTime;
	}	
	
	@Override
	public String toString() {
		return "NewsPost{"+"headlines'"+headlines+'\''+
				", newsTime="+ newsTime+'\''+'}';
	}
}
