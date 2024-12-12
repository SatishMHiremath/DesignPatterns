package com.test.creational.prototype;

public class PrototypePatternExample {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(20, 10);
        Rectangle rectangle2 = (Rectangle) rectangle1.clone();
        Circle circle1 = new Circle(5);
        Circle circle2 = (Circle) circle1.clone();

        rectangle1.draw();
        rectangle2.draw();
        circle1.draw();
        circle2.draw();
    }
}
