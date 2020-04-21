package com.company;

import java.awt.*;

import static java.lang.Math.pow;

public class Circle extends Shape {
    private double radius;

    public Circle(){
        setRadius(1.0);
    }

    public Circle(double radius){
        setRadius(radius);
    }

    public Circle(Color color, boolean filled, double radius){
        super(color, filled);
        setRadius(radius);
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public double getArea(){
        return 3.14*(Math.pow(radius, 2));
    }

    public double getPerimeter(){
        return 3.14*2*radius;
    }

    public String toString(){
        return "A Circle with radius = " + radius + ", which is a subclass of " + super.toString();
    }
}
