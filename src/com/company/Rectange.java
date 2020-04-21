package com.company;

import javafx.scene.paint.Color;

public class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle() {
        setWidth(1.0);
        setLength(1.0);
    }

    public Rectangle(double width, double length) {
        setWidth(width);
        setLength(length);
    }

    public Rectangle(Color color, boolean filled, double width, double length) {
        super(color, filled);
        setWidth(width);
        setLength(length);
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public double getArea(){
        return length*width;
    }

    public double getPerimeter(){
        return (length + width)*2;
    }

    public String toString() {
        return "A Rectangle with width=" + width + " and length=" + length +
                ", which is a subclass of " + super.toString();
    }
}

