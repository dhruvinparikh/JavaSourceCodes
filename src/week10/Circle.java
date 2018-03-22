/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week10;

/**
 *
 * @author imsil
 * Class: Circle
Data Members: + radius : double
Methods: 
* + Circle() 
* + Circle(radius : double) 
* + calcArea() : double 
* + calcCircumference() : double 
* + toString() : String
The calcArea() and calcCircumference() methods calculate and return the area and 
* circumference of the circle (Use Google if you need to find the formulas). 
* The default constructor sets radius to a default value of 1. 
* The toString() method returns a string representation of the circle in the form:
Circle: radius = x.x
(where x.x is the radius value, formatted to 1 decimal place)
 */
public class Circle {
    double radius;
    
    public Circle(){
        radius = 1;
    }
    
    public Circle(double radius){
        this.radius = radius;
    }
    
    public double calcArea(){
        return Math.PI * radius * radius;
    }
    
    public double calcCircumference(){
        return 2 * Math.PI * radius;
    }
    
    public String getDimensions(){
        return "Circle:radius " + (int)(radius * 10)/10.0;
    }
    
    public String toString(){
        return getDimensions();
    }
    
}
