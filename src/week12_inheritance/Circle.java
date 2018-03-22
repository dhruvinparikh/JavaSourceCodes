/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week12_inheritance;

/**
 *
 * @author imsil
 */
public class Circle extends Shape{
    
    protected double radius;
    
    public Circle(){
        this(5);
        System.out.println("Circle constructor");
    }
    
    public Circle(double radius){
        super("white");
        System.out.println("Circle parametrised constructor");
        this.radius=radius;
        
        //super.getColor();
    }
    
    public  double getArea(){
        return Math.PI*radius*radius;
    }

    public String toString() {
        return "Circle{" + "radius=" + radius + '}';
    }
    
    public boolean equals(Circle obj){
        if(obj instanceof Circle)
            return ((Circle)obj).getRadius() == radius;
        return false;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    
    
}
