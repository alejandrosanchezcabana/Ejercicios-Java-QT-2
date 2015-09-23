package edu.upc.eetac.dsa.alejandro;

/**
 * Created by Alex on 23/9/15.
 */
public class Rectangle extends AbstractShape {
    private double base;
    private double height;

    public Rectangle (double base, double height){
        super("rectangle");
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double area(){
        return base*height;
    }
}
