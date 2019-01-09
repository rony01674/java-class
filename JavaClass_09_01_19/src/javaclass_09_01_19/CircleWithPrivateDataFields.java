package javaclass_09_01_19;

public class CircleWithPrivateDataFields {

    double radius;

    CircleWithPrivateDataFields(double x) {
        radius = x;
    }

    public double getArea() {
        return Math.pow(radius, 2) * 3.1415956;
    }

    public double getRadius() {
        return radius;
    }
}
