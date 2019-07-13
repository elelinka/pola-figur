package com.google;

public class Rectangle {

    double sideA;
    double sideB;

    public Rectangle(double a, double b) {
        sideA = a;
        sideB = b;
    }

    public double rectPerimeter() {
        return (sideA * 2) + (sideB * 2);
    }
}
