import interfaces.Shape;
import shapes.Circle;
import shapes.Rectangle;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");

        //Coding to an interface and not the implementation
        Shape shape = new Circle(10);

        //Drawing the shape
        shape.draw();
        System.out.println("Area of Circle = " + shape.getArea());
        //Switching form one implementation to another easily
        shape = new Rectangle(10, 10);
        shape.draw();
        System.out.println("Area of a Rectangle = "+ shape.getArea());

        //Default in the Interface
        shape.defaultTest();
    }
}
