package com.test.soliddesign;

class Rectangle implements Shape {
    private double width;
    private double height;

    public Rectangle(int width, int height) {
    	this.width = width;
    	this.height = height; 			
	}

	@Override
    public double calculateArea() {
        return width * height;
    }
}