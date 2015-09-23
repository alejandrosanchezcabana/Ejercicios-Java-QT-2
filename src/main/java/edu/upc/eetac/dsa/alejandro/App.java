package edu.upc.eetac.dsa.alejandro;

import edu.upc.eetac.dsa.alejandro.Shape;

import java.awt.*;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main (String args[]){
        Shape [] shapes =new Shape[2];
        shapes[0]=new Circle(2.5);
        shapes[1]=new Rectangle(3, 5);
        for (Shape shape : shapes)
            System.out.println(shape +" with area " + shape.area());

    }
}
