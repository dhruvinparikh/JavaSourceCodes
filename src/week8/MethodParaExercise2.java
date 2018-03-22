/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8;

import java.util.Scanner;

/**
 *
 * @author n01150847
 * Write a program that calculates and displays the area and circumference of a 
 * circle. Your program should prompt the user to enter the radius. Your program 
 * should also include two methods: getCircumference() calculates and displays 
 * the circumference (2 * PI * radius) of the circle and getArea() calculates 
 * and displays the area (PI*radius2) of the circle. Both of these methods will 
 * require the radius, so radius should be passed into each method.
 */
public class MethodParaExercise2 {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter radius:");
        float floatRadius = scanner.nextFloat();
        
        
      System.out.println("Circumference is " + getCircumference(floatRadius)+" units and area is " + getArea(floatRadius) + " sq units");  
    }
    
    public static float getCircumference(float radius){
        return (float)(2*3.14*radius);
    }
    
    public static float getArea(float radius){
        return (float)(3.14*radius*radius);
    }
    
}
