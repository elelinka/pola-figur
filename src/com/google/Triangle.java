package com.google;

public class Triangle {

    double sideA;
    double sideB;
    double sideC;

    public Triangle(double a, double b, double c) {
        sideA = a;
        sideB = b;
        sideC = c;
    }

    public double trianglePerimeter() {
        return sideA + sideB + sideC;
    }
}
