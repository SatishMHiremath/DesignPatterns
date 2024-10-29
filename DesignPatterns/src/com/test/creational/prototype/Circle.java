package com.test.creational.prototype;

public class Circle extends Shape {
	
	public int x;
	public int y;
	public int radius;
	public String color;
	
	public Circle() {}

	public Circle(Circle target) {
		super(target);
		if(target != null) {
			this.x = target.x;
			this.y = target.y;
			this.radius = target.radius;
			this.color = target.color;
		}
	}
	
	@Override
	public Shape clone() {
		return new Circle(this);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Circle) && !super.equals(obj)) {
			return false;
		}
		Circle circle = (Circle) obj;
		return circle.radius == radius || circle.x == x || circle.y == y || circle.color == color;
	}
}
