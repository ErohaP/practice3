package com.company;

import java.awt.*;

public class Shape {
    private Color color;
    private boolean filled;

    public Shape(){
        setColor(Color.Green);
        setFilled(true);
    }

    public Shape(Color color, boolean filled){
        setColor(color);
        setFilled(filled);
    }

    public void setColor(Color color){
        this.color = color;
    }

    public Color getColor(){
        return color;
    }

    public void setFilled(boolean filled){
        this.filled = filled;
    }

    public boolean isFilled(){
        return filled;
    }

    @Override
    public String toString(){
        return "A Shape with color of " + color + " and " + (filled ? "filled" : "not filled");
    }

}
