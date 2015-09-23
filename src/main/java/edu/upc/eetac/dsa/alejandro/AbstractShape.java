package edu.upc.eetac.dsa.alejandro;

/**
 * Created by Alex on 23/9/15.
 */
public abstract class AbstractShape implements Shape{
    private String type;

    public AbstractShape(String type){
        this.type=type;
    }
    @Override
public String toString() {
        return "I'm a " + type;

    }
}
