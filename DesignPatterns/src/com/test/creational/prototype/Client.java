package com.test.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Client {
	public static void main(String[] args) {
		List<Shape> shapeList = new ArrayList<Shape>();
		List<Shape> shapeCopy =  new ArrayList<Shape>();
		Circle circle = new Circle();
		circle.x = 10;
		circle.y = 10;
		circle.radius = 15;
		circle.color = "red";
		shapeList.add(circle);
		
		Circle circleRef = (Circle)circle.clone();
		shapeList.add(circleRef);
		
		System.out.println("Object copy of circle instance : "+ circle.color.equals(circleRef.color));
	}
}
