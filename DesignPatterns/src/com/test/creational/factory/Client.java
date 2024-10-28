package com.test.creational.factory;

import java.time.LocalDateTime;

public class Client {
	public static void main(String[] args) {
		Post post = new PostFactory().createPost("blog");
		if(post instanceof BlogPost) {
			((BlogPost)post).setAuthor("A");
			((BlogPost) post).setTags(new String[] {"Java", "Design Patterns", "Factory"});
		}
		if(post instanceof NewsPost) {
			((NewsPost)post).setHeadlines("");
			((NewsPost)post).setNewsTime(LocalDateTime.now());
		}
		if(post instanceof ProductPost) {
			((ProductPost)post).setName("A");
			((ProductPost)post).setImageUrl("https://.......");
		}
		System.out.println(post);
	}
}
