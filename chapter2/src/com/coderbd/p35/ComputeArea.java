package com.coderbd.p35;

import java.awt.geom.Area;

public class ComputeArea {

    static double radius = 20;
    static double area;

    public static void main(String[] args) {
        area = radius * radius * 3.1416;
        System.out.println("Area: " + area);
    }
}
