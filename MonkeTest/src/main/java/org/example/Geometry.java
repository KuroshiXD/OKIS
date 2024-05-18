package org.example;

public class Geometry {
    public double calculateSquareArea(double sideLength) {
        if (sideLength <= 0) {
            throw new IllegalArgumentException("Side length must be positive");
        }
        return sideLength * sideLength;
    }

    public double calculateRectangleArea(double length, double width) {
        if (length <= 0 || width <= 0) {
            throw new IllegalArgumentException("Length and width must be positive");
        }
        return length * width;
    }

    public double calculateCircleArea(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be positive");
        }
        return Math.PI * radius * radius;
    }
}
