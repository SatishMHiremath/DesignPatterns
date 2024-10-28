package com.test.creational.factory;

public class ProductPost extends Post {
	private String name;
	private String imageUrl;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	
	@Override
	public String toString() {
		return "ProductsPost{"+"name'"+name+'\''+
				", imageUrl="+ imageUrl+'\''+'}';
	}	
}
