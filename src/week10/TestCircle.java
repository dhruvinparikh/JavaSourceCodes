/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week10;

/**
 *
 * @author imsil
 */
public class TestCircle {
    public static void main(String[] args){
        Circle circle1 = new Circle();
        
        System.out.println(circle1);
        System.out.println("Area of circle1 is " + circle1.calcArea());
        System.out.println("Circumference of circle1 is " + circle1.calcCircumference());
        
        Circle circle2 = new Circle(15.23);
        System.out.println();
        
        System.out.println(circle2);
        System.out.println("Area of circle2 is " + circle2.calcArea());
        System.out.println("Circumference of circle2 is " + circle2.calcCircumference());
        
        Circle circle3 = new Circle();
        circle3.radius = 3.63;
        System.out.println();
        System.out.println(circle3);
        System.out.println("Area of circle3 is " + circle3.calcArea());
        System.out.println("Circumference of circle3 is " + circle3.calcCircumference());
    }
}
