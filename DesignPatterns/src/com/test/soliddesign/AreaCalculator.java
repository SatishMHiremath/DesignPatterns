package com.test.soliddesign;


class AreaCalculator {
    public double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 10);
        Shape circle = new Circle(3);

        double rectangleArea = new AreaCalculator().calculateArea(rectangle);
        double circleArea = new AreaCalculator().calculateArea(circle);

        System.out.println("Rectangle area: " + rectangleArea);
        System.out.println("Circle area: " + circleArea);
    }
}