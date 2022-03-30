package shapes;

import interfaces.Shape;

import java.util.ArrayList;

public class Circle implements Shape {

    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw(){
        System.out.println(LABEL + " Drawing Circle!");

    }

    /*
    == checks the memory address
    .equals() will check the value
     */

    @Override
    public double getArea(){
        return Math.PI * this.radius * this.radius;
    }

    public double getRadius(){
        return this.radius;
    }
}
