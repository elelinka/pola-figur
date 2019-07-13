package com.google;

public class Circle {

    final double pi = 3.13;
    double radius;

    public Circle(double r) {
        radius = r;
    }

    public double circleAre() {
        return pi * radius * radius;
    }
}
