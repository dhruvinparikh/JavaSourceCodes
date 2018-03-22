/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author venkatsa
 */
public class Circle extends Shape{
    double radius;
    public Circle()
    {
        System.out.println("Circle constructor");
    }
    
    public Circle(double radius){
         super("white");
        System.out.println("Circle parameterized constructor");
       
        this.radius = radius;
    }
    
}
