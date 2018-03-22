/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week11;

/**
 *
 * @author imsil
 */
public class TestSquare {
    public static void main(String[] args){
        Square square1 = new Square();
        
        square1.setSquare(10.82345);
        
        System.out.println("Square : "+square1.getSquare());
        System.out.println("Area of square1 is " + square1.calcArea());
        System.out.println(square1);
        System.out.println("Perimeter of square1 is " + square1.calcPerimeter());
    }
    
}
