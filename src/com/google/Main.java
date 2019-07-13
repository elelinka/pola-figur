package com.google;

public class Main {

    public static void main(String[] args) {
        ShapeCalculator shapeCalculator = new ShapeCalculator();
        Square square = new Square(5);
        Rectangle rectangle = new Rectangle(5, 2);
        Circle circle = new Circle(2);
        Triangle triangle = new Triangle(5, 2, 6);

        double circleArea = shapeCalculator.circleAre(circle);
        System.out.println(circleArea);
        double rectanglePerimeter = shapeCalculator.rectPerimeter(rectangle);
        System.out.println(rectanglePerimeter);
        double squareArea = shapeCalculator.squareArea(square);
        System.out.println(squareArea);
        double trianglePerimeter = shapeCalculator.trianglePerimeter(triangle);
        System.out.println(trianglePerimeter);
    }
}
