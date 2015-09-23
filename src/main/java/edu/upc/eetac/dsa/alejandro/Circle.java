package edu.upc.eetac.dsa.alejandro;

/**
 * Created by Alex on 23/9/15.
 */
public class Circle extends AbstractShape {
    private double radio;
public Circle(double radio){
    super("circle");
}

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double area(){
        return Math.PI*radio*radio;
    }
}
