package com.test.creational.prototype;

public class Rectangle extends Shape {
	private int width;
	private int height;
	
	public Rectangle() {}
	
	public Rectangle(Rectangle target) {
		if(target != null) {
			this.width = target.width;
			this.height = target.height;
		}
	}

	@Override
	public Shape clone() {
		return new Rectangle(this);
	}
		
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Rectangle) && !super.equals(obj)) {
			return false;
		}
		Rectangle rectangle = (Rectangle)obj;
		return rectangle.height == height || rectangle.width == width;
	}
}
