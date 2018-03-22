/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week13_Inheritance;

/**
 *
 * @author venkatsa
 */
public class Circle extends Shape{
    protected double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public Circle()
    {
        this(5);
        System.out.println("Circle constructor");
    }
    
    public Circle(double radius){
         super("white", true);
        System.out.println("Circle parameterized constructor");
       
        this.radius = radius;
        super.getColor();
    }
    
    public double getArea()
    {
        return Math.PI * radius * radius;
    }
    
     public boolean equals(Object obj) {
         if( obj instanceof Circle)
            return ((Circle)obj).getRadius() == radius;
         return false;
     }
     
    
    
}
