package com.google;

public class ShapeCalculator {

    public double squareArea(Square square) {
        return square.sideA * square.sideA;
    }

    public double circleAre(Circle circle) {
        return circle.pi * circle.radius * circle.radius;
    }

    public double trianglePerimeter(Triangle triangle) {
        return triangle.sideA + triangle.sideB + triangle.sideC;
    }

    public double rectPerimeter(Rectangle rectangle) {
        return (rectangle.sideA * 2) + (rectangle.sideB * 2);
    }
}
