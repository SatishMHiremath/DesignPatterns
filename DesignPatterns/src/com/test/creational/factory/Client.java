package com.test.creational.factory;

public class Client {
	public static void main(String[] args) {
		Post post = new PostFactory().createPost("blog");
		if(post instanceof BlogPost) {
			((BlogPost)post).setAuthor("A");
			((BlogPost) post).setTags(new String[] {"Java", "Design Patterns", "Factory"});
		}
		System.out.println(post);
	}
}
