package com.google;

public class Main {

    public static void main(String[] args) {
        //ShapeCalculator shapeCalculator = new ShapeCalculator();
        Square square = new Square(5);
        Rectangle rectangle = new Rectangle(5, 2);
        Circle circle = new Circle(2);
        Triangle triangle = new Triangle(5, 2, 6);

        double circleArea = circle.circleAre();
        System.out.println("Pole koła: " + circleArea);

        double rectanglePerimeter = rectangle.rectPerimeter();
        System.out.println("Obwód prostokąta: " + rectanglePerimeter);

        double squareArea = square.squareArea();
        System.out.println("Pole kwadratu: " + squareArea);

        double trianglePerimeter = triangle.trianglePerimeter();
        System.out.println("Obwód trójkąta: " + trianglePerimeter);
    }
}
