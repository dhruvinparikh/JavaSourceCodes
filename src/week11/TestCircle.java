/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week11;

import java.util.Scanner;

/**
 *
 * @author imsil
 */
public class TestCircle {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Circle circle1 = new Circle();
        
        System.out.println("Enter radius of circle(>0) : ");
        double radius = scanner.nextDouble();
        
        circle1.setRadius(radius);
        
        System.out.println("Radius : "+circle1.getRadius());
        System.out.println(circle1);
        System.out.println("Area of circle1 is " + circle1.calcArea());
        System.out.println("Circumference of circle1 is " + circle1.calcCircumference());
    }
}
