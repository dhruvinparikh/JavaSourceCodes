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
public class TestSquare {
    public static void main(String[] args){
        Square square1 = new Square();
        
        square1.side = 10.82345;
        
        System.out.println("Area of square1 is " + square1.calcArea());
        System.out.println(square1);
        System.out.println("Perimeter of square1 is " + square1.calcPerimeter());
        
        Square square2 = new Square();
        
        System.out.println("Area of square1 is " + square2.calcArea());
        System.out.println(square2);
        System.out.println("Perimeter of square1 is " + square2.calcPerimeter());
        
        Square square3 = new Square(6.9);
        
        System.out.println("Area of square1 is " + square3.calcArea());
        System.out.println(square3);
        System.out.println("Perimeter of square1 is " + square3.calcPerimeter());
    }
    
}
